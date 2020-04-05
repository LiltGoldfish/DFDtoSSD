package com.lt.entity;

public class CTArc {
    private CTNode from;
    private CTNode to;
    private CTArc link;

    public CTArc() {
    }

    public CTArc(CTNode from, CTNode to, CTArc link) {
        this.from = from;
        this.to = to;
        this.link = link;
    }

    public CTArc getLink() {
        return link;
    }

    public void setLink(CTArc link) {
        this.link = link;
    }

    public CTNode getTo() {
        return to;
    }

    public void setTo(CTNode node) {
        this.to = node;
    }

    public CTNode getFrom() {
        return from;
    }

    public void setFrom(CTNode from) {
        this.from = from;
    }
}
