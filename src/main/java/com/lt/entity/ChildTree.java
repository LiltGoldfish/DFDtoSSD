package com.lt.entity;

import java.util.*;

public class ChildTree {
    List<CTNode> nodes;
    Set<CTNode> set ; //visited
    Set<CTArc>  arcSet ;//存储所有的边
    //带有root节点 以及三个模块头节点
    public ChildTree() {
        nodes = new ArrayList<>();
        arcSet = new HashSet<>();
        CTNode root = new CTNode();
        root.setInfo("root");
        root.setId("root");
        CTNode input = new CTNode();
        input.setInfo("input");
        input.setId("input");
        CTNode process = new CTNode();
        process.setInfo("process");
        process.setId("process");
        CTNode output = new CTNode();
        output.setInfo("output");
        output.setId("output");

        CTArc arc1 = new CTArc();
        CTArc arc2 = new CTArc();
        CTArc arc3 = new CTArc();
        arc1.setFrom(root);
        arc1.setTo(input);
        arc1.setLink(arc2);
        arc2.setTo(process);
        arc2.setFrom(root);
        arc2.setLink(arc3);
        arc3.setTo(output);
        arc3.setFrom(root);
        arc3.setLink(null);
        root.setFirstChild(arc1);
        this.getNodes().add(root);
        this.getNodes().add(input);
        this.getNodes().add(process);
        this.getNodes().add(output);
        this.arcSet.add(arc1);
        this.arcSet.add(arc2);
        this.arcSet.add(arc3);
    }

    public List<CTNode> getNodes() {
        return nodes;
    }

    public void DFS(){
        set = new HashSet<>();
        CTNode root = nodes.get(0);
        DFSTravel(root);
    }


    public Set<CTArc> getArcSet() {
        return arcSet;
    }

    public void DFSTravel(CTNode node){
        set.add(node);
        System.out.println(node.getInfo());
        CTArc arc = node.getFirstChild();
        while(arc!=null){
            CTNode child = arc.getTo();
            if(!set.contains(child)){
                DFSTravel(child);
            }
            arc = arc.getLink();
        }
    }
}
