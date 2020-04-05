package com.lt.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lt.entity.*;

import java.util.*;

public class TreeToJson {
    private static DFD dfd = new DFD();
    private static Map<String , NodesEntity> map = new HashMap<>();
    private static int inputMaxLayer = 0;
    private static List<Integer> inputLayerCount = new ArrayList<>();
    private static int processMaxLayer = 0;
    private static List<Integer> processLayerCount = new ArrayList<>();
    private static int outputMaxLayer = 0;
    private static List<Integer> outputLayerCount = new ArrayList<>();
    private static Set<CTNode> set = new HashSet<>();
    private static Set<CTArc> arcList = new HashSet<>();

    //根据树获得相应的json对象
    public static DFD getJson(ChildTree tree) throws JsonProcessingException {

        //root和process节点位置固定 其余节点相对于他们调整
        CTNode root = tree.getNodes().get(0);
        CTNode input = tree.getNodes().get(1);
        CTNode process = tree.getNodes().get(2);
        CTNode output = tree.getNodes().get(3);
        NodesEntity rootEntity = getNodeEntity(989, 43, root);
        dfd.getNodes().add(rootEntity);
        map.put(rootEntity.getId(),rootEntity);

        NodesEntity processEntity = getNodeEntity(989, 160, process);
        dfd.getNodes().add(processEntity);
        map.put(processEntity.getId(),processEntity);

        //计算三个模块的最大深度与每层的节点个数
        calInputLayer(tree);
        calOutputLayer(tree);
        calProcessLayer(tree);

        //input和output节点相对于process的位置进行构造
        int inputWidth = inputMaxLayer * 150 + (inputMaxLayer - 1) * 50 ;
        int processWidth= processMaxLayer * 150 + (processMaxLayer - 1) * 50 ;
        int outputWidth = outputMaxLayer * 150 + (outputMaxLayer - 1) * 50 ;
        int inputX = processEntity.getRect().getX() - inputWidth/2 - processWidth/2 - 100;
        int inputY = processEntity.getRect().getY();
        int outputX = processEntity.getRect().getX() + processWidth/2 + outputWidth/2 + 100;
        int outputY = processEntity.getRect().getY();
        int processX = processEntity.getRect().getX();
        int processY = processEntity.getRect().getY();

        NodesEntity outputEntity = getNodeEntity(outputX, outputY, tree.getNodes().get(3));
        dfd.getNodes().add(outputEntity);
        map.put(outputEntity.getId(),outputEntity);

        //input模块的所有节点构造
        Queue<CTNode> queue = new LinkedList<>();
        queue.add(input);
        int inputLayer = -1 ;    //当前遍历到input的层数
        int inputIndex = 0 ;    //当前遍历到该层的第几个
        while (!queue.isEmpty()){
            int size = queue.size();
            inputLayer++;
            inputIndex = 0;
            int layer = inputLayerCount.get(inputLayer);  //当前层数的节点个数
            int start = 0;
            if(layer!=inputMaxLayer)
                start = (inputX - inputWidth/2) +( (inputMaxLayer - layer) * 150 + (  (inputMaxLayer - layer) * 50 ) )/ 2 + 75;
            else
                start = inputX - inputWidth/2 + 75;
            for(int i = 0 ; i < size ;i++){
                CTNode node = queue.poll();
                if(node.getId().equals(input.getId())){
                    NodesEntity inputEntity = getNodeEntity(inputX, inputY, tree.getNodes().get(1));
                    dfd.getNodes().add(inputEntity);
                    map.put(inputEntity.getId(),inputEntity);
                    CTArc child = node.getFirstChild();
                    while(child != null){
                        queue.add(child.getTo());
                        child = child.getLink();
                    }
                }
                else {
                    inputIndex++;
                    int  x = start + (inputIndex - 1) * 150 + (inputIndex - 1) * 50;
                    int y = inputLayer * 150 + inputY ;
                    NodesEntity nodeEntity = getNodeEntity(x, y, node);
                    dfd.getNodes().add(nodeEntity);
                    map.put(nodeEntity.getId(),nodeEntity);
                    CTArc child = node.getFirstChild();
                    while(child != null){
                        queue.add(child.getTo());
                        child = child.getLink();
                    }
                }
            }
        }

        //process模块的所有节点构造
        Queue<CTNode> queue2 = new LinkedList<>();
        queue2.add(process);
        int processLayer = -1 ;    //当前遍历到process的层数
        int processIndex = 0 ;    //当前遍历到该层的第几个
        while (!queue2.isEmpty()){
            int size = queue2.size();
            processLayer++;
            processIndex = 0;
            int layer = processLayerCount.get(processLayer);  //当前层数的节点个数
            int start = 0;
            if(layer!=processMaxLayer)
                start = (processX - processWidth/2) +( (processMaxLayer - layer) * 150 + (  (processMaxLayer - layer)  * 50 ) )/ 2 + 75;
            else
                start = processX - processWidth/2 + 75;
            for(int i = 0 ; i < size ;i++){
                CTNode node = queue2.poll();
                if(node.getId().equals(process.getId())){
                    CTArc child = node.getFirstChild();
                    while(child != null){
                        queue2.add(child.getTo());
                        child = child.getLink();
                    }
                }
                else {
                    processIndex++;
                    int x = start + (processIndex - 1) * 150 + 50 * ( processIndex - 1 );
                    int y = processLayer * 150 + processY ;
                    NodesEntity nodeEntity = getNodeEntity(x, y, node);
                    dfd.getNodes().add(nodeEntity);
                    map.put(nodeEntity.getId(),nodeEntity);
                    CTArc child = node.getFirstChild();
                    while(child != null){
                        queue2.add(child.getTo());
                        child = child.getLink();
                    }
                }
            }
        }

        //output模块的所有节点构造
        Queue<CTNode> queue3 = new LinkedList<>();
        queue3.add(output);
        int outputLayer = -1 ;    //当前遍历到output的层数
        int outputIndex = 0 ;    //当前遍历到该层的第几个
        while (!queue3.isEmpty()){
            int size = queue3.size();
            outputLayer++;
            outputIndex = 0;
            int layer = outputLayerCount.get(outputLayer);  //当前层数的节点个数
            int start = 0;
            if(layer!=outputMaxLayer)
                start = (outputX - outputWidth/2 + 75) +( (outputMaxLayer - layer) * 150 + (  (outputMaxLayer - layer)   * 50 ) )/ 2 ;
            else
                start = outputX - outputWidth/2 + 75;
            for(int i = 0 ; i < size ;i++){
                CTNode node = queue3.poll();
                if(node.getId().equals(output.getId())){
                    CTArc child = node.getFirstChild();
                    while(child != null){
                        queue3.add(child.getTo());
                        child = child.getLink();
                    }
                }
                else {
                    outputIndex++;
                    int x = start + (outputIndex - 1) * 150 + 50 * ( outputIndex - 1 );
                    int y = outputLayer * 150 + outputY ;
                    NodesEntity nodeEntity = getNodeEntity(x, y, node);
                    dfd.getNodes().add(nodeEntity);
                    map.put(nodeEntity.getId(),nodeEntity);
                    CTArc child = node.getFirstChild();
                    while(child != null){
                        queue3.add(child.getTo());
                        child = child.getLink();
                    }
                }
            }
        }

        //构造边节点
        Set<CTArc> arcSet = tree.getArcSet();
        for (CTArc ctArc : arcSet) {
            dfd.getLines().add(getLineEntity(ctArc));
        }

        return dfd;
/*        ObjectMapper mapper = new ObjectMapper();
        return mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(dfd);*/

    }

    //输入树的节点，以及x,y坐标生成对应Json节点
    private static NodesEntity getNodeEntity(int x , int y ,CTNode node){
        NodesEntity nodeEntity = new NodesEntity();
        nodeEntity.setId(node.getId());
        nodeEntity.setName("rectangle");
        nodeEntity.getRect().setX(x);
        nodeEntity.getRect().setY(y);
        nodeEntity.getRect().setWidth(150);
        nodeEntity.getRect().setHeight(50);
        nodeEntity.setLineWidth(1);
        nodeEntity.setRotate(0);
        nodeEntity.setOffsetRotate(0);
        nodeEntity.setGlobalAlpha(1);
        nodeEntity.setDash(0);
        nodeEntity.setStrokeStyle("#222");
        nodeEntity.setFillStyle("");
        nodeEntity.getFont().setBackground("");
        nodeEntity.getFont().setColor("#222");
        nodeEntity.getFont().setFontFamily("Black Font");
        nodeEntity.getFont().setFontSize(16);
        nodeEntity.getFont().setLineHeight(1.5);
        nodeEntity.getFont().setFontStyle("normal");
        nodeEntity.getFont().setFontWeight("normal");
        nodeEntity.getFont().setTextAlign("center");
        nodeEntity.getFont().setTextBaseline("middle");
        nodeEntity.setLineDashOffset(0);
        nodeEntity.setText(node.getInfo());
        nodeEntity.setTextOffsetX(0);
        nodeEntity.setTextOffsetY(0);
        nodeEntity.setData("");
        nodeEntity.setZRotate(0);
        nodeEntity.setBorderRadius(0.1);
        nodeEntity.setIconSize(null);
        nodeEntity.setImageAlign("center");
        nodeEntity.setBkType(0);
        nodeEntity.setGradientAngle(0);
        nodeEntity.setGradientRadius(0.01);
        nodeEntity.setPaddingBottom(10);
        nodeEntity.setPaddingBottomNum(10);
        nodeEntity.setPaddingLeft(10);
        nodeEntity.setPaddingLeftNum(10);
        nodeEntity.setPaddingRight(10);
        nodeEntity.setPaddingRightNum(10);
        nodeEntity.setPaddingTop(10);
        nodeEntity.setPaddingTopNum(10);
        return nodeEntity;
    }

    //输入树的边 生成json中的边对象
    private static LinesEntity getLineEntity(CTArc link){
        LinesEntity lineEntity = new LinesEntity();
        CTNode from = link.getFrom();
        CTNode to = link.getTo();
        lineEntity.setId(from.getId()+"to"+to.getId());
        lineEntity.setName("line");
        lineEntity.setLineWidth(1);
        lineEntity.setRotate(0);
        lineEntity.setOffsetRotate(0);
        lineEntity.setGlobalAlpha(1);
        lineEntity.setDash(0);
        lineEntity.setStrokeStyle("#222");
        lineEntity.setFillStyle("");
        lineEntity.getFont().setColor("");
        lineEntity.getFont().setFontFamily("Black Font");
        lineEntity.getFont().setFontSize(12);
        lineEntity.getFont().setFontStyle("normal");
        lineEntity.getFont().setFontWeight("normal");
        lineEntity.getFont().setTextAlign("center");
        lineEntity.getFont().setTextBaseline("middle");
        lineEntity.getFont().setBackground("#fff");
        lineEntity.getFont().setLineHeight(1.5);
        lineEntity.setLocked(false);
        lineEntity.setTextOffsetX(0);
        lineEntity.setTextOffsetY(0);
        lineEntity.setFromArrowSize(5);
        lineEntity.setToArrowSize(5);
        lineEntity.setBorderWidth(0);
        lineEntity.setBorderColor("#000000");
        lineEntity.setIsAnimate(false);
        lineEntity.setFromArrow("");
        lineEntity.getFrom().setX(map.get(from.getId()).getRect().getX()+75);
        lineEntity.getFrom().setY(map.get(from.getId()).getRect().getY()+50);
        lineEntity.getFrom().setId(from.getId());
        lineEntity.getFrom().setAnchorIndex(3);
        lineEntity.getFrom().setDirection(3);
        lineEntity.setTextRect(null);
        lineEntity.getTo().setX(map.get(to.getId()).getRect().getX()+75);
        lineEntity.getTo().setY(map.get(to.getId()).getRect().getY());
        lineEntity.getTo().setId(to.getId());
        lineEntity.getTo().setAnchorIndex(1);
        lineEntity.getTo().setDirection(1);
        lineEntity.setToArrow("triangleSolid");
        lineEntity.setBkType(0);
        lineEntity.setImageAlign("center");
        lineEntity.setControlPoints(new ArrayList<>());
        return lineEntity;
    }

    //计算input模块的最大宽度 以及每层的节点个数
    private static void calInputLayer(ChildTree tree){
        CTNode input = tree.getNodes().get(1);
        //input为第零层
        inputLayerCount.add(1);
        DFSTravelInput(input,1);
        int max = 0 ;
        for (Integer integer : inputLayerCount) {
            if(max<integer)
                max = integer;
        }
        inputMaxLayer = max;
    }

    //深度优先遍历input的每个节点
    private static void DFSTravelInput(CTNode node , int layer) {
        set.add(node);
        CTArc arc = node.getFirstChild();
        while (arc != null) {
            CTNode child = arc.getTo();
            if (!set.contains(child)) {
                if(layer>inputLayerCount.size()-1)
                    inputLayerCount.add(1);
                else
                    inputLayerCount.set(layer,inputLayerCount.get(layer)+1);
                DFSTravelInput(child,layer+1);
            }
            arc = arc.getLink();
        }
    }

    //计算process模块的最大宽度 以及每层的节点个数
    private static void calProcessLayer(ChildTree tree){
        CTNode process = tree.getNodes().get(2);
        processLayerCount.add(1);
        DFSTravelProcess(process,1);
        int max = 0 ;
        for (Integer integer : processLayerCount) {
            if(max<integer)
                max = integer;
        }
        processMaxLayer = max;
    }

    //深度优先遍历process的每个节点
    private static void DFSTravelProcess(CTNode node , int layer) {
        set.add(node);
        CTArc arc = node.getFirstChild();
        while (arc != null) {
            CTNode child = arc.getTo();
            if (!set.contains(child)) {
                if(layer>processLayerCount.size()-1)
                    processLayerCount.add(1);
                else
                    processLayerCount.set(layer,processLayerCount.get(layer)+1);
                DFSTravelProcess(child,layer+1);
            }
            arc = arc.getLink();
        }
    }

    //计算output模块的最大宽度 以及每层的节点个数
    private static void calOutputLayer(ChildTree tree){
        CTNode output = tree.getNodes().get(3);
        outputLayerCount.add(1);
        DFSTravelOutput(output,1);
        int max = 0 ;
        for (Integer integer : outputLayerCount) {
            if(max<integer)
                max = integer;
        }
        outputMaxLayer = max;
    }

    //深度优先遍历output的每个节点
    private static void DFSTravelOutput(CTNode node , int layer) {
        set.add(node);
        CTArc arc = node.getFirstChild();
        while (arc != null) {
            CTNode child = arc.getTo();
            if (!set.contains(child)) {
                if(layer>outputLayerCount.size()-1)
                    outputLayerCount.add(1);
                else
                    outputLayerCount.set(layer,outputLayerCount.get(layer)+1);
                DFSTravelOutput(child,layer+1);
            }
            arc = arc.getLink();
        }
    }


}
