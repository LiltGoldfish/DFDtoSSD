package com.lt.entity;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private List<VNode> nodes;  // 顶点数组
    private int edgeNum;
    private int nodeNum;
    private boolean[] visited ;
    private Map<String,VNode> map;
    public Graph() {
        nodes = new ArrayList<>();
    }

    public Graph(List<VNode> nodes, int edgeNum, int nodeNum) {
        nodes = new ArrayList<>();
        this.nodes = nodes;
        this.edgeNum = edgeNum;
        this.nodeNum = nodeNum;
    }

    public List<VNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<VNode> nodes) {
        this.nodes = nodes;
    }

    public int getEdgeNum() {
        return edgeNum;
    }

    public void setEdgeNum(int edgeNum) {
        this.edgeNum = edgeNum;
    }

    public int getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(int nodeNum) {
        this.nodeNum = nodeNum;
    }

    public void DFS() {
        visited = new boolean[this.getNodeNum()];
        map = new HashMap<>();
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
            map.put(this.getNodes().get(i).getId(),this.getNodes().get(i));
        }
        DFSTravel(this.getNodes().get(0));
    }

    public void DFSTravel(VNode node){
        System.out.println(node.getText());
        visited[this.getNodes().indexOf(node)]=true;
        ENode eNode = node.firstEdge;
        while (eNode!=null){
            if(!visited[this.getNodes().indexOf(map.get(eNode.getId()))]){
                DFSTravel(map.get(eNode.getId()));
            }
            eNode=eNode.nextEdge;
        }
    }
}
