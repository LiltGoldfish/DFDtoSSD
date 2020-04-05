package com.lt.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown=true)
public class NodesEntity {
    /**
     * lineDashOffset : 0
     * rotate : 0
     * gradientRadius : 0.01
     * data :
     * paddingBottomNum : 10
     * paddingRight : 10
     * anchors : [{"x":54,"y":342,"direction":4},{"x":159,"y":317,"direction":1},{"x":264,"y":342,"direction":2},{"x":159,"y":367,"direction":3}]
     * animateDuration : 0
     * zRotate : 0
     * lineWidth : 1
     * fullTextRect : {"ex":254,"ey":357,"center":{"x":159,"y":342},"x":64,"width":190,"y":327,"height":30}
     * rect : {"ex":264,"ey":367,"center":{"x":159,"y":342},"x":54,"width":210,"y":317,"height":50}
     * paddingBottom : 10
     * globalAlpha : 1
     * iconSize : null
     * id : b334a64d
     * text : 储户
     * paddingTop : 10
     * animateStart : 0
     * textOffsetX : 0
     * textOffsetY : 0
     * textRect : {"ex":254,"ey":357,"center":{"x":159,"y":353.25},"x":64,"width":190,"y":349.5,"height":7.5}
     * offsetRotate : 0
     * paddingLeftNum : 10
     * strokeStyle : #222
     * dockWatchers : [{"x":159,"y":342},{"x":48,"y":319},{"x":258,"y":319},{"x":258,"y":369},{"x":48,"y":369}]
     * animateCycleIndex : 0
     * bkType : 0
     * paddingTopNum : 10
     * animateFrames : []
     * fullIconRect : {"ex":254,"ey":357,"center":{"x":159,"y":342},"x":64,"width":190,"y":327,"height":30}
     * tags : []
     * rotatedAnchors : [{"x":54,"y":342,"direction":4},{"x":159,"y":317,"direction":1},{"x":264,"y":342,"direction":2},{"x":159,"y":367,"direction":3}]
     * borderRadius : 0.1
     * animateType :
     * name : rectangle
     * gradientAngle : 0
     * fillStyle :
     * paddingRightNum : 10
     * dash : 0
     * imageAlign : center
     * paddingLeft : 10
     * iconRect : {"ex":254,"ey":344.5,"center":{"x":159,"y":335.75},"x":64,"width":190,"y":327,"height":17.5}
     * font : {"textBaseline":"middle","fontFamily":"\"Hiragino Sans GB\", \"Microsoft YaHei\", \"Helvetica Neue\", Helvetica, Arial","color":"#222","textAlign":"center","background":"","fontSize":18,"lineHeight":1.5,"fontStyle":"normal","fontWeight":"normal"}
     */
    private int lineDashOffset;
    private int rotate;
    private double gradientRadius;
    private String data;
    private int paddingBottomNum;
    private int paddingRight;
    private List<AnchorsEntity> anchors;
    private int animateDuration;
    private int zRotate;
    private int lineWidth;
    private FullTextRectEntity fullTextRect;
    private RectEntity rect;
    private int paddingBottom;
    private int globalAlpha;
    private String iconSize;
    private String id;
    private String text;
    private int paddingTop;
    private int animateStart;
    private int textOffsetX;
    private int textOffsetY;
    private TextRectEntity textRect;
    private int offsetRotate;
    private int paddingLeftNum;
    private String strokeStyle;
    private List<DockWatchersEntity> dockWatchers;
    private int animateCycleIndex;
    private int bkType;
    private int paddingTopNum;
    private List<?> animateFrames;
    private FullIconRectEntity fullIconRect;
    private List<?> tags;
    private List<RotatedAnchorsEntity> rotatedAnchors;
    private double borderRadius;
    private String animateType;
    private String name;
    private int gradientAngle;
    private String fillStyle;
    private int paddingRightNum;
    private int dash;
    private String imageAlign;
    private int paddingLeft;
    private IconRectEntity iconRect;
    private FontEntity font;

    public NodesEntity() {
        rect = new RectEntity();
        font = new FontEntity();
    }

    public NodesEntity(int lineDashOffset, int rotate, double gradientRadius, String data, int paddingBottomNum, int paddingRight, List<AnchorsEntity> anchors, int animateDuration, int zRotate, int lineWidth, FullTextRectEntity fullTextRect, RectEntity rect, int paddingBottom, int globalAlpha, String iconSize, String id, String text, int paddingTop, int animateStart, int textOffsetX, int textOffsetY, TextRectEntity textRect, int offsetRotate, int paddingLeftNum, String strokeStyle, List<DockWatchersEntity> dockWatchers, int animateCycleIndex, int bkType, int paddingTopNum, List<?> animateFrames, FullIconRectEntity fullIconRect, List<?> tags, List<RotatedAnchorsEntity> rotatedAnchors, double borderRadius, String animateType, String name, int gradientAngle, String fillStyle, int paddingRightNum, int dash, String imageAlign, int paddingLeft, IconRectEntity iconRect, FontEntity font) {
        this.lineDashOffset = lineDashOffset;
        this.rotate = rotate;
        this.gradientRadius = gradientRadius;
        this.data = data;
        this.paddingBottomNum = paddingBottomNum;
        this.paddingRight = paddingRight;
        this.anchors = anchors;
        this.animateDuration = animateDuration;
        this.zRotate = zRotate;
        this.lineWidth = lineWidth;
        this.fullTextRect = fullTextRect;
        this.rect = rect;
        this.paddingBottom = paddingBottom;
        this.globalAlpha = globalAlpha;
        this.iconSize = iconSize;
        this.id = id;
        this.text = text;
        this.paddingTop = paddingTop;
        this.animateStart = animateStart;
        this.textOffsetX = textOffsetX;
        this.textOffsetY = textOffsetY;
        this.textRect = textRect;
        this.offsetRotate = offsetRotate;
        this.paddingLeftNum = paddingLeftNum;
        this.strokeStyle = strokeStyle;
        this.dockWatchers = dockWatchers;
        this.animateCycleIndex = animateCycleIndex;
        this.bkType = bkType;
        this.paddingTopNum = paddingTopNum;
        this.animateFrames = animateFrames;
        this.fullIconRect = fullIconRect;
        this.tags = tags;
        this.rotatedAnchors = rotatedAnchors;
        this.borderRadius = borderRadius;
        this.animateType = animateType;
        this.name = name;
        this.gradientAngle = gradientAngle;
        this.fillStyle = fillStyle;
        this.paddingRightNum = paddingRightNum;
        this.dash = dash;
        this.imageAlign = imageAlign;
        this.paddingLeft = paddingLeft;
        this.iconRect = iconRect;
        this.font = font;
    }

    public void setLineDashOffset(int lineDashOffset) {
        this.lineDashOffset = lineDashOffset;
    }

    public void setRotate(int rotate) {
        this.rotate = rotate;
    }

    public void setGradientRadius(double gradientRadius) {
        this.gradientRadius = gradientRadius;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setPaddingBottomNum(int paddingBottomNum) {
        this.paddingBottomNum = paddingBottomNum;
    }

    public void setPaddingRight(int paddingRight) {
        this.paddingRight = paddingRight;
    }

    public void setAnchors(List<AnchorsEntity> anchors) {
        this.anchors = anchors;
    }

    public void setAnimateDuration(int animateDuration) {
        this.animateDuration = animateDuration;
    }

    public void setZRotate(int zRotate) {
        this.zRotate = zRotate;
    }

    public void setLineWidth(int lineWidth) {
        this.lineWidth = lineWidth;
    }

    public void setFullTextRect(FullTextRectEntity fullTextRect) {
        this.fullTextRect = fullTextRect;
    }

    public void setRect(RectEntity rect) {
        this.rect = rect;
    }

    public void setPaddingBottom(int paddingBottom) {
        this.paddingBottom = paddingBottom;
    }

    public void setGlobalAlpha(int globalAlpha) {
        this.globalAlpha = globalAlpha;
    }

    public void setIconSize(String iconSize) {
        this.iconSize = iconSize;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setPaddingTop(int paddingTop) {
        this.paddingTop = paddingTop;
    }

    public void setAnimateStart(int animateStart) {
        this.animateStart = animateStart;
    }

    public void setTextOffsetX(int textOffsetX) {
        this.textOffsetX = textOffsetX;
    }

    public void setTextOffsetY(int textOffsetY) {
        this.textOffsetY = textOffsetY;
    }

    public void setTextRect(TextRectEntity textRect) {
        this.textRect = textRect;
    }

    public void setOffsetRotate(int offsetRotate) {
        this.offsetRotate = offsetRotate;
    }

    public void setPaddingLeftNum(int paddingLeftNum) {
        this.paddingLeftNum = paddingLeftNum;
    }

    public void setStrokeStyle(String strokeStyle) {
        this.strokeStyle = strokeStyle;
    }

    public void setDockWatchers(List<DockWatchersEntity> dockWatchers) {
        this.dockWatchers = dockWatchers;
    }

    public void setAnimateCycleIndex(int animateCycleIndex) {
        this.animateCycleIndex = animateCycleIndex;
    }

    public void setBkType(int bkType) {
        this.bkType = bkType;
    }

    public void setPaddingTopNum(int paddingTopNum) {
        this.paddingTopNum = paddingTopNum;
    }

    public void setAnimateFrames(List<?> animateFrames) {
        this.animateFrames = animateFrames;
    }

    public void setFullIconRect(FullIconRectEntity fullIconRect) {
        this.fullIconRect = fullIconRect;
    }

    public void setTags(List<?> tags) {
        this.tags = tags;
    }

    public void setRotatedAnchors(List<RotatedAnchorsEntity> rotatedAnchors) {
        this.rotatedAnchors = rotatedAnchors;
    }

    public void setBorderRadius(double borderRadius) {
        this.borderRadius = borderRadius;
    }

    public void setAnimateType(String animateType) {
        this.animateType = animateType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGradientAngle(int gradientAngle) {
        this.gradientAngle = gradientAngle;
    }

    public void setFillStyle(String fillStyle) {
        this.fillStyle = fillStyle;
    }

    public void setPaddingRightNum(int paddingRightNum) {
        this.paddingRightNum = paddingRightNum;
    }

    public void setDash(int dash) {
        this.dash = dash;
    }

    public void setImageAlign(String imageAlign) {
        this.imageAlign = imageAlign;
    }

    public void setPaddingLeft(int paddingLeft) {
        this.paddingLeft = paddingLeft;
    }

    public void setIconRect(IconRectEntity iconRect) {
        this.iconRect = iconRect;
    }

    public void setFont(FontEntity font) {
        this.font = font;
    }

    public int getLineDashOffset() {
        return lineDashOffset;
    }

    public int getRotate() {
        return rotate;
    }

    public double getGradientRadius() {
        return gradientRadius;
    }

    public String getData() {
        return data;
    }

    public int getPaddingBottomNum() {
        return paddingBottomNum;
    }

    public int getPaddingRight() {
        return paddingRight;
    }

    public List<AnchorsEntity> getAnchors() {
        return anchors;
    }

    public int getAnimateDuration() {
        return animateDuration;
    }

    public int getZRotate() {
        return zRotate;
    }

    public int getLineWidth() {
        return lineWidth;
    }

    public FullTextRectEntity getFullTextRect() {
        return fullTextRect;
    }

    public RectEntity getRect() {
        return rect;
    }

    public int getPaddingBottom() {
        return paddingBottom;
    }

    public int getGlobalAlpha() {
        return globalAlpha;
    }

    public String getIconSize() {
        return iconSize;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public int getPaddingTop() {
        return paddingTop;
    }

    public int getAnimateStart() {
        return animateStart;
    }

    public int getTextOffsetX() {
        return textOffsetX;
    }

    public int getTextOffsetY() {
        return textOffsetY;
    }

    public TextRectEntity getTextRect() {
        return textRect;
    }

    public int getOffsetRotate() {
        return offsetRotate;
    }

    public int getPaddingLeftNum() {
        return paddingLeftNum;
    }

    public String getStrokeStyle() {
        return strokeStyle;
    }

    public List<DockWatchersEntity> getDockWatchers() {
        return dockWatchers;
    }

    public int getAnimateCycleIndex() {
        return animateCycleIndex;
    }

    public int getBkType() {
        return bkType;
    }

    public int getPaddingTopNum() {
        return paddingTopNum;
    }

    public List<?> getAnimateFrames() {
        return animateFrames;
    }

    public FullIconRectEntity getFullIconRect() {
        return fullIconRect;
    }

    public List<?> getTags() {
        return tags;
    }

    public List<RotatedAnchorsEntity> getRotatedAnchors() {
        return rotatedAnchors;
    }

    public double getBorderRadius() {
        return borderRadius;
    }

    public String getAnimateType() {
        return animateType;
    }

    public String getName() {
        return name;
    }

    public int getGradientAngle() {
        return gradientAngle;
    }

    public String getFillStyle() {
        return fillStyle;
    }

    public int getPaddingRightNum() {
        return paddingRightNum;
    }

    public int getDash() {
        return dash;
    }

    public String getImageAlign() {
        return imageAlign;
    }

    public int getPaddingLeft() {
        return paddingLeft;
    }

    public IconRectEntity getIconRect() {
        return iconRect;
    }

    public FontEntity getFont() {
        return font;
    }


}
