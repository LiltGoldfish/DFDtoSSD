package com.lt.utils;

import com.lt.entity.NodesEntity;

public class ClassifyType {
    public static String getType(NodesEntity node){
        String shape = node.getName();
        int width = node.getRect().getWidth();
        if(shape.equals("rectangle")&&width==210)
            return "origin";
        if(shape.equals("rectangle")&&width==200)
            return "end";
        if(shape.equals("circle")&&width==99)
            return "input";
        if(shape.equals("circle")&&width==100)
            return "process";
        if(shape.equals("circle")&&width==101)
            return "output";
        if(shape.equals("flowParallel"))
            return "store";
        return "error";
    }
}
