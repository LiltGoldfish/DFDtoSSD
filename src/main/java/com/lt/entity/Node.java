package com.lt.entity;

public class Node {
    String id;           //节点的id
    String info;         //数据
    String type;         //类型：源点、终点、输入、处理、输出
    Arc firstin;         //第一条以该节点为弧尾的弧
    Arc firstout;        //第一条以该结点为弧头的弧

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Arc getFirstin() {
        return firstin;
    }

    public void setFirstin(Arc firstin) {
        this.firstin = firstin;
    }

    public Arc getFirstout() {
        return firstout;
    }

    public void setFirstout(Arc firstout) {
        this.firstout = firstout;
    }

    public Node(String id, String info, String type, Arc firstin, Arc firstout) {
        this.id = id;
        this.info = info;
        this.type = type;
        this.firstin = firstin;
        this.firstout = firstout;
    }
}
