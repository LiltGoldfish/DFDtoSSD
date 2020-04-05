package com.lt.entity;

public class CTNode {
    String id;
    String info;
    CTArc firstChild;

    public CTNode() {
    }

    public CTNode(String id, String info, CTArc firstChild) {
        this.id = id;
        this.info = info;
        this.firstChild = firstChild;
    }

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

    public CTArc getFirstChild() {
        return firstChild;
    }

    public void setFirstChild(CTArc firstChild) {
        this.firstChild = firstChild;
    }
}
