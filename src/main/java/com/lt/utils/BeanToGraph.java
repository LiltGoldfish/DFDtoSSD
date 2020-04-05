package com.lt.utils;

import com.lt.entity.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BeanToGraph {
    public static Graph  beanToGraph(DFD dfd){
        Graph graph = new Graph();
        graph.setEdgeNum(dfd.getLines().size());
        graph.setNodeNum(dfd.getNodes().size());
        //打表记录图形对应的类型值
        HashMap<String,Integer> map = new HashMap<>();
        map.put("rectangle",0);
        map.put("circle",2);
        map.put("flowParallel",3);
        //存储顶点节点
        Map<String,VNode> nodeMap = new HashMap<>();
        //构造所有的顶点节点
        for(int i=0;i<dfd.getNodes().size();i++){
            NodesEntity node = dfd.getNodes().get(i);
            int type = map.get(node.getName());
            String text = node.getText();
            VNode vNode = new VNode(node.getId(),type,null,text);
            nodeMap.put(vNode.getId(),vNode);
            graph.getNodes().add(vNode);
            if(type==0)
                map.put("rectangle",1);

        }
        //构造所有的边节点
        for(int i=0;i<dfd.getLines().size();i++){
            LinesEntity line = dfd.getLines().get(i);
            VNode vNode = nodeMap.get(line.getFrom().getId());
            ENode pre = vNode.getFirstEdge();
            if(pre==null){
                vNode.setFirstEdge(new ENode(line.getTo().getId(),null));
                continue;
            }
            ENode p = pre.getNextEdge();
            while(p!=null){
                pre=p;
                p=pre.getNextEdge();
            }
            pre.setNextEdge(new ENode(line.getTo().getId(),null));
        }
        return graph;
    }
}
