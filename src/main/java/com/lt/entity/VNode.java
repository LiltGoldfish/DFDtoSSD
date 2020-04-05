package com.lt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 邻接表中表的顶点
// 0表示源点，1表示终点，2表示处理，3表示存储
public class VNode {
    String id;          // 顶点信息
    int type;
    ENode firstEdge;    // 指向第一条依附该顶点的弧
    String text;

    public VNode() {
    }

    public VNode(String id, int type, ENode firstEdge, String text) {
        this.id = id;
        this.type = type;
        this.firstEdge = firstEdge;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public ENode getFirstEdge() {
        return firstEdge;
    }

    public void setFirstEdge(ENode firstEdge) {
        this.firstEdge = firstEdge;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
};