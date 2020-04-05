package com.lt.utils;

import com.lt.entity.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OLGraphToTree {
    private static Set<Node> set = new HashSet<>();
    private static ChildTree tree = new ChildTree();
    private static List<Node> input = new ArrayList<>();
    private static List<Node> process = new ArrayList<>();


    public static ChildTree getTree(OLGraph olGraph) {
        //第一遍遍历构造input模块
        for (Node origin : olGraph.getOrigins()) {
            //拿到input头节点
            CTNode pre = tree.getNodes().get(1);
            DFSTraverse1(pre, origin);
        }
        //第二遍遍历构造process模块和output模块
        set = new HashSet<>();
        for (Node node : input) {
            //pre1是process头节点 pre2是output头节点
            CTNode pre1 = tree.getNodes().get(2);
            CTNode pre2 = tree.getNodes().get(3);
            DFSTraverse2(pre1,pre2,node);
        }
        return tree;
    }

    //构造input模块的第一次遍历
    public static void DFSTraverse1(CTNode pre , Node node){
            if(node.getType().equals("origin")){
                //访问过此节点 标记
                set.add(node);
                Arc out = node.getFirstout();
                while (out!=null) {
                    if (!set.contains(out.getHeadvex())) {
                        DFSTraverse1(pre, out.getHeadvex());
                    }
                    out = out.getTlink();
                }
            }
            if(node.getType().equals("input")){
                //访问过此节点 标记 并且加入input集合中
                set.add(node);
                input.add(node);
                //根据图的node创建孩子树的ctNode
                CTNode ctNode = new CTNode(node.getId(),node.getInfo(),null);
                //构造一条指向这个ctNode的边
                CTArc ctArc = new CTArc(pre,ctNode,null);
                tree.getArcSet().add(ctArc);
                //找到pre的孩子链表的尾位置并将这条边插入
                CTArc arc = pre.getFirstChild();
                CTArc next = null;
                if(arc==null){
                    pre.setFirstChild(ctArc);
                }
                else {
                    next = arc.getLink();
                    while(next!=null){
                        arc = next;
                        next = arc.getLink();
                    }
                    arc.setLink(ctArc);
                }
                pre = ctNode;
                Arc out = node.getFirstout();
                while (out!=null) {
                    if (!set.contains(out.getHeadvex())) {
                        DFSTraverse1(pre, out.getHeadvex());
                    }
                    out = out.getTlink();
                }
            }
            else return;
    }

    //构造process模块和output模块的第二次遍历
    public static void DFSTraverse2(CTNode pre1 ,CTNode pre2 ,Node node){
        if(node==null) return;
        if(set.contains(node)) return;;
        if(node.getType().equals("input")){
            set.add(node);
            Arc out = node.getFirstout();
            while (out!=null) {
                if (!set.contains(out.getHeadvex())) {
                    DFSTraverse2(pre1, pre2, out.getHeadvex());
                }
                out = out.getTlink();
            }
        }

        if(node.getType().equals("process")){
            //访问过此节点 标记 并且加入process集合中
            set.add(node);
            process.add(node);
            //根据图的node创建孩子树的ctNode
            CTNode ctNode = new CTNode(node.getId(),node.getInfo(),null);
            //构造一条指向这个ctNode的边
            CTArc ctArc = new CTArc(pre1,ctNode,null);
            tree.getArcSet().add(ctArc);
            //找到pre的孩子链表的尾位置并将这条边插入
            CTArc arc = pre1.getFirstChild();
            CTArc next = null;
            if(arc==null){
                pre1.setFirstChild(ctArc);
            }
            else {
                next = arc.getLink();
                while(next!=null){
                    arc = next;
                    next = arc.getLink();
                }
                arc.setLink(ctArc);
            }
            pre1 = ctNode;
            Arc out = node.getFirstout();
            while (out!=null) {
                if (!set.contains(out.getHeadvex())) {
                    DFSTraverse2(pre1, pre2, out.getHeadvex());
                }
                out = out.getTlink();
            }
        }

        if(node.getType().equals("output")) {
            //访问过此节点 标记
            set.add(node);
            //根据图的node创建孩子树的ctNode
            CTNode ctNode = new CTNode(node.getId(), node.getInfo(), null);
            //构造一条指向这个ctNode的边
            CTArc ctArc = new CTArc(pre2,ctNode, null);
            tree.getArcSet().add(ctArc);
            //找到pre的孩子链表的尾位置并将这条边插入
            CTArc arc = pre2.getFirstChild();
            CTArc next = null;
            if (arc == null) {
                pre2.setFirstChild(ctArc);
            } else {
                next = arc.getLink();
                while (next != null) {
                    arc = next;
                    next = arc.getLink();
                }
                arc.setLink(ctArc);
            }
            pre2 = ctNode;
            Arc out = node.getFirstout();
            while (out != null) {
                if (!set.contains(out.getHeadvex())) {
                    DFSTraverse2(pre1, pre2, out.getHeadvex());
                }
                out = out.getTlink();
            }
        }

        if(node.getType().equals("store")) {
            //访问过此节点 标记
            set.add(node);
            //遍历存储节点所有的出度(没有访问过的)，若没有非存储节点作为前驱结点，则添加 
            Arc storeOut = node.getFirstout();
            while (storeOut!=null){
                boolean flag = true;
                Arc in = storeOut.getHeadvex().getFirstin();
                while(in!=null){
                    if(!in.getTailvex().getType().equals("store")) {
                        flag = false;
                        break;
                    }
                    in = in.getHlink();
                }
                if(flag){
                    //此出度边对应的节点加入到process并标记
                    set.add(storeOut.getHeadvex());
                    //根据图的node创建孩子树的ctNode
                    CTNode ctNode = new CTNode(storeOut.getHeadvex().getId(),storeOut.getHeadvex().getInfo(),null);
                    //构造一条指向这个ctNode的边

                    if(storeOut.getHeadvex().getType().equals("process")) {
                        CTArc ctArc = new CTArc(pre1,ctNode,null);
                        tree.getArcSet().add(ctArc);
                        //找到pre的孩子链表的尾位置并将这条边插入
                        CTArc arc = pre1.getFirstChild();
                        CTArc next = null;
                        if (arc == null) {
                            pre1.setFirstChild(ctArc);
                        } else {
                            next = arc.getLink();
                            while (next != null) {
                                arc = next;
                                next = arc.getLink();
                            }
                            arc.setLink(ctArc);
                        }
                        pre1 = ctNode;
                    }
                    if(storeOut.getHeadvex().getType().equals("output")) {
                        CTArc ctArc = new CTArc(pre2,ctNode,null);
                        tree.getArcSet().add(ctArc);
                        //找到pre的孩子链表的尾位置并将这条边插入
                        CTArc arc = pre2.getFirstChild();
                        CTArc next = null;
                        if (arc == null) {
                            pre2.setFirstChild(ctArc);
                        } else {
                            next = arc.getLink();
                            while (next != null) {
                                arc = next;
                                next = arc.getLink();
                            }
                            arc.setLink(ctArc);
                        }
                        pre2 = ctNode;
                    }
                    Arc out = storeOut.getHeadvex().getFirstout();
                    while (out!=null) {
                        if (!set.contains(out.getHeadvex())) {
                            DFSTraverse2(pre1, pre2, out.getHeadvex());
                        }
                        out = out.getTlink();
                    }
                }
                storeOut = storeOut.getTlink();
            }
        }

    }
}
