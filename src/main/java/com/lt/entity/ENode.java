package com.lt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 邻接表中表对应的链表的顶点
public class ENode {
    String id;       // 该边所指向的顶点的位置
    ENode nextEdge; // 指向下一条弧的指针

    public ENode() {
    }

    public ENode(String id, ENode nextEdge) {
        this.id = id;
        this.nextEdge = nextEdge;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ENode getNextEdge() {
        return nextEdge;
    }

    public void setNextEdge(ENode nextEdge) {
        this.nextEdge = nextEdge;
    }
}
