package com.lt.utils;

import com.lt.entity.*;

import java.util.HashMap;
import java.util.Map;

public class BeanToOLGraph {
    public static OLGraph getOLGraph(DFD dfd){
        OLGraph graph = new OLGraph();
        graph.setNodeNum(dfd.getNodes().size());
        graph.setArcNum(dfd.getLines().size());
        Map<String, Node> map = new HashMap<>();
        for (int i = 0; i < dfd.getNodes().size() ; i++) {
            NodesEntity nodeEntity = dfd.getNodes().get(i);
            Node node = new Node(nodeEntity.getId(),nodeEntity.getText(),ClassifyType.getType(nodeEntity),null,null);
            graph.getNodes().add(node);
            map.put(node.getId(),node);
            if(node.getType().equals("origin"))
                graph.getOrigins().add(node);
        }
        for (int i = 0; i < dfd.getLines().size(); i++) {
            LinesEntity lineEntity = dfd.getLines().get(i);
            Node tail = map.get(lineEntity.getFrom().getId());
            Node head = map.get(lineEntity.getTo().getId());
            Arc arc = new Arc(tail,head,null,null,lineEntity.getText());
            //构造出度 将这条边放在相同弧尾的边节点后
            Arc tailArc = tail.getFirstout();
            Arc tailLink = null;
            if(tailArc==null) {
                tail.setFirstout(arc);
            }
            else{
                tailLink = tailArc.getTlink();
                while (tailLink!=null){
                    tailArc=tailLink;
                    tailLink=tailLink.getTlink();
                }
                tailArc.setTlink(arc);
            }
            //构造入度 将这条边放在相同弧尾的边节点后
        Arc headArc = head.getFirstin();
        Arc headLink = null;
        if(headArc==null) {
            head.setFirstin(arc);
        }
        else{
            headLink = headArc.getHlink();
            while (headLink!=null){
                headArc=headLink;
                headLink=headLink.getHlink();
            }
            headArc.setHlink(arc);
        }
    }
        return graph;
    }

}
