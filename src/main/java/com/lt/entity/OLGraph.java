package com.lt.entity;

import java.util.ArrayList;
import java.util.List;

public class OLGraph {
    List<Node> nodes ;
    int arcNum;
    int nodeNum;
    List<Node> origins;

    public OLGraph() {
        nodes = new ArrayList<>();
        origins = new ArrayList<>();
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public int getArcNum() {
        return arcNum;
    }

    public void setArcNum(int arcNum) {
        this.arcNum = arcNum;
    }

    public int getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(int nodeNum) {
        this.nodeNum = nodeNum;
    }

    public List<Node> getOrigins() {
        return origins;
    }

    public void setOrigins(List<Node> origins) {
        this.origins = origins;
    }

    public OLGraph(List<Node> nodes, int arcNum, int nodeNum) {
        this.nodes = nodes;
        this.arcNum = arcNum;
        this.nodeNum = nodeNum;
    }

}
