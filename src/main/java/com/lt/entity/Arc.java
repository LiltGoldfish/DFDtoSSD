package com.lt.entity;



public class Arc {
    private Node tailvex;              //该弧的弧尾结点在图中的位置
    private Node headvex;              //该弧的弧头结点在图中的位置
    private Arc hlink;                   //下一条与该弧有相同弧头结点的弧
    private Arc tlink;                   //下一条与该弧有相同弧尾结点的弧
    private String info;                 //弧的相关信息

    public Arc() {
    }

    public Arc(Node tailvex, Node headvex, Arc hlink, Arc tlink, String info) {
        this.tailvex = tailvex;
        this.headvex = headvex;
        this.hlink = hlink;
        this.tlink = tlink;
        this.info = info;
    }

    public Node getTailvex() {
        return tailvex;
    }

    public void setTailvex(Node tailvex) {
        this.tailvex = tailvex;
    }

    public Node getHeadvex() {
        return headvex;
    }

    public void setHeadvex(Node headvex) {
        this.headvex = headvex;
    }

    public Arc getHlink() {
        return hlink;
    }

    public void setHlink(Arc hlink) {
        this.hlink = hlink;
    }

    public Arc getTlink() {
        return tlink;
    }

    public void setTlink(Arc tlink) {
        this.tlink = tlink;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

