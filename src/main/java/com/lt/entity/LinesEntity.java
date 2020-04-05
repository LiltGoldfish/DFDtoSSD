package com.lt.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown=true)
public class LinesEntity {
    /**
     * rotate : 0
     * borderColor : #000000
     * animatePos : 0
     * animateSpan : 1
     * toArrow : triangleSolid
     * isAnimate : false
     * lineWidth : 1
     * rect : {"ex":0,"ey":0,"center":{"x":0,"y":0},"x":0,"width":0,"y":0,"height":0}
     * animateDotSize : 3
     * globalAlpha : 1
     * borderWidth : 0
     * fromArrow :
     * from : {"anchorIndex":2,"x":264,"y":342,"id":"b334a64d","direction":2}
     * id : 5dd1582f
     * text : 存款单
     * animateStart : 0
     * locked : false
     * textOffsetX : 0
     * textOffsetY : 0
     * textRect : {"ex":720,"ey":273.5,"center":{"x":492,"y":260},"x":264,"width":456,"y":246.5,"height":27}
     * offsetRotate : 0
     * strokeStyle : #222
     * animateCycleIndex : 0
     * animateFromSize : 0
     * bkType : 0
     * fromArrowSize : 5
     * controlPoints : []
     * toArrowSize : 5
     * animateToSize : 0
     * tags : []
     * name : line
     * fillStyle :
     * animateColor :
     * to : {"anchorIndex":0,"x":720,"y":178,"id":"97dd6717","direction":4}
     * dash : 0
     * imageAlign : center
     * font : {"textBaseline":"middle","fontFamily":"\"Hiragino Sans GB\", \"Microsoft YaHei\", \"Helvetica Neue\", Helvetica, Arial","color":"","textAlign":"center","background":"#fff","fontSize":18,"lineHeight":1.5,"fontStyle":"normal","fontWeight":"normal"}
     */
    private int rotate;
    private String borderColor;
    private int animatePos;
    private int animateSpan;
    private String toArrow;
    private boolean isAnimate;
    private int lineWidth;
    private RectEntity rect;
    private int animateDotSize;
    private int globalAlpha;
    private int borderWidth;
    private String fromArrow;
    private FromEntity from;
    private String id;
    private String text;
    private int animateStart;
    private boolean locked;
    private int textOffsetX;
    private int textOffsetY;
    private TextRectEntity textRect;
    private int offsetRotate;
    private String strokeStyle;
    private int animateCycleIndex;
    private int animateFromSize;
    private int bkType;
    private int fromArrowSize;
    private List<?> controlPoints;
    private int toArrowSize;
    private int animateToSize;
    private List<?> tags;
    private String name;
    private String fillStyle;
    private String animateColor;
    private ToEntity to;
    private int dash;
    private String imageAlign;
    private FontEntity font;

    public LinesEntity() {
        from = new FromEntity();
        to = new ToEntity();
        font = new FontEntity();
    }

    public LinesEntity(int rotate, String borderColor, int animatePos, int animateSpan, String toArrow, boolean isAnimate, int lineWidth, RectEntity rect, int animateDotSize, int globalAlpha, int borderWidth, String fromArrow, FromEntity from, String id, String text, int animateStart, boolean locked, int textOffsetX, int textOffsetY, TextRectEntity textRect, int offsetRotate, String strokeStyle, int animateCycleIndex, int animateFromSize, int bkType, int fromArrowSize, List<?> controlPoints, int toArrowSize, int animateToSize, List<?> tags, String name, String fillStyle, String animateColor, ToEntity to, int dash, String imageAlign, FontEntity font) {
        this.rotate = rotate;
        this.borderColor = borderColor;
        this.animatePos = animatePos;
        this.animateSpan = animateSpan;
        this.toArrow = toArrow;
        this.isAnimate = isAnimate;
        this.lineWidth = lineWidth;
        this.rect = rect;
        this.animateDotSize = animateDotSize;
        this.globalAlpha = globalAlpha;
        this.borderWidth = borderWidth;
        this.fromArrow = fromArrow;
        this.from = from;
        this.id = id;
        this.text = text;
        this.animateStart = animateStart;
        this.locked = locked;
        this.textOffsetX = textOffsetX;
        this.textOffsetY = textOffsetY;
        this.textRect = textRect;
        this.offsetRotate = offsetRotate;
        this.strokeStyle = strokeStyle;
        this.animateCycleIndex = animateCycleIndex;
        this.animateFromSize = animateFromSize;
        this.bkType = bkType;
        this.fromArrowSize = fromArrowSize;
        this.controlPoints = controlPoints;
        this.toArrowSize = toArrowSize;
        this.animateToSize = animateToSize;
        this.tags = tags;
        this.name = name;
        this.fillStyle = fillStyle;
        this.animateColor = animateColor;
        this.to = to;
        this.dash = dash;
        this.imageAlign = imageAlign;
        this.font = font;
    }

    public void setRotate(int rotate) {
        this.rotate = rotate;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public void setAnimatePos(int animatePos) {
        this.animatePos = animatePos;
    }

    public void setAnimateSpan(int animateSpan) {
        this.animateSpan = animateSpan;
    }

    public void setToArrow(String toArrow) {
        this.toArrow = toArrow;
    }

    public void setIsAnimate(boolean isAnimate) {
        this.isAnimate = isAnimate;
    }

    public void setLineWidth(int lineWidth) {
        this.lineWidth = lineWidth;
    }

    public void setRect(RectEntity rect) {
        this.rect = rect;
    }

    public void setAnimateDotSize(int animateDotSize) {
        this.animateDotSize = animateDotSize;
    }

    public void setGlobalAlpha(int globalAlpha) {
        this.globalAlpha = globalAlpha;
    }

    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }

    public void setFromArrow(String fromArrow) {
        this.fromArrow = fromArrow;
    }

    public void setFrom(FromEntity from) {
        this.from = from;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnimateStart(int animateStart) {
        this.animateStart = animateStart;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
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

    public void setStrokeStyle(String strokeStyle) {
        this.strokeStyle = strokeStyle;
    }

    public void setAnimateCycleIndex(int animateCycleIndex) {
        this.animateCycleIndex = animateCycleIndex;
    }

    public void setAnimateFromSize(int animateFromSize) {
        this.animateFromSize = animateFromSize;
    }

    public void setBkType(int bkType) {
        this.bkType = bkType;
    }

    public void setFromArrowSize(int fromArrowSize) {
        this.fromArrowSize = fromArrowSize;
    }

    public void setControlPoints(List<?> controlPoints) {
        this.controlPoints = controlPoints;
    }

    public void setToArrowSize(int toArrowSize) {
        this.toArrowSize = toArrowSize;
    }

    public void setAnimateToSize(int animateToSize) {
        this.animateToSize = animateToSize;
    }

    public void setTags(List<?> tags) {
        this.tags = tags;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFillStyle(String fillStyle) {
        this.fillStyle = fillStyle;
    }

    public void setAnimateColor(String animateColor) {
        this.animateColor = animateColor;
    }

    public void setTo(ToEntity to) {
        this.to = to;
    }

    public void setDash(int dash) {
        this.dash = dash;
    }

    public void setImageAlign(String imageAlign) {
        this.imageAlign = imageAlign;
    }

    public void setFont(FontEntity font) {
        this.font = font;
    }

    public int getRotate() {
        return rotate;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public int getAnimatePos() {
        return animatePos;
    }

    public int getAnimateSpan() {
        return animateSpan;
    }

    public String getToArrow() {
        return toArrow;
    }

    public boolean isIsAnimate() {
        return isAnimate;
    }

    public int getLineWidth() {
        return lineWidth;
    }

    public RectEntity getRect() {
        return rect;
    }

    public int getAnimateDotSize() {
        return animateDotSize;
    }

    public int getGlobalAlpha() {
        return globalAlpha;
    }

    public int getBorderWidth() {
        return borderWidth;
    }

    public String getFromArrow() {
        return fromArrow;
    }

    public FromEntity getFrom() {
        return from;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public int getAnimateStart() {
        return animateStart;
    }

    public boolean isLocked() {
        return locked;
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

    public String getStrokeStyle() {
        return strokeStyle;
    }

    public int getAnimateCycleIndex() {
        return animateCycleIndex;
    }

    public int getAnimateFromSize() {
        return animateFromSize;
    }

    public int getBkType() {
        return bkType;
    }

    public int getFromArrowSize() {
        return fromArrowSize;
    }

    public List<?> getControlPoints() {
        return controlPoints;
    }

    public int getToArrowSize() {
        return toArrowSize;
    }

    public int getAnimateToSize() {
        return animateToSize;
    }

    public List<?> getTags() {
        return tags;
    }

    public String getName() {
        return name;
    }

    public String getFillStyle() {
        return fillStyle;
    }

    public String getAnimateColor() {
        return animateColor;
    }

    public ToEntity getTo() {
        return to;
    }

    public int getDash() {
        return dash;
    }

    public String getImageAlign() {
        return imageAlign;
    }

    public FontEntity getFont() {
        return font;
    }

    public class RectEntity {
        /**
         * ex : 0
         * ey : 0
         * center : {"x":0,"y":0}
         * x : 0
         * width : 0
         * y : 0
         * height : 0
         */
        private int ex;
        private int ey;
        private CenterEntity center;
        private int x;
        private int width;
        private int y;
        private int height;

        public void setEx(int ex) {
            this.ex = ex;
        }

        public void setEy(int ey) {
            this.ey = ey;
        }

        public void setCenter(CenterEntity center) {
            this.center = center;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public void setY(int y) {
            this.y = y;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getEx() {
            return ex;
        }

        public int getEy() {
            return ey;
        }

        public CenterEntity getCenter() {
            return center;
        }

        public int getX() {
            return x;
        }

        public int getWidth() {
            return width;
        }

        public int getY() {
            return y;
        }

        public int getHeight() {
            return height;
        }

        public class CenterEntity {
            /**
             * x : 0
             * y : 0
             */
            private int x;
            private int y;

            public void setX(int x) {
                this.x = x;
            }

            public void setY(int y) {
                this.y = y;
            }

            public int getX() {
                return x;
            }

            public int getY() {
                return y;
            }
        }
    }

    public class FromEntity {
        /**
         * anchorIndex : 2
         * x : 264
         * y : 342
         * id : b334a64d
         * direction : 2
         */
        private int anchorIndex;
        private int x;
        private int y;
        private String id;
        private int direction;

        public void setAnchorIndex(int anchorIndex) {
            this.anchorIndex = anchorIndex;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setDirection(int direction) {
            this.direction = direction;
        }

        public int getAnchorIndex() {
            return anchorIndex;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public String getId() {
            return id;
        }

        public int getDirection() {
            return direction;
        }
    }

    public class TextRectEntity {
        /**
         * ex : 720
         * ey : 273.5
         * center : {"x":492,"y":260}
         * x : 264
         * width : 456
         * y : 246.5
         * height : 27
         */
        private int ex;
        private double ey;
        private CenterEntity center;
        private int x;
        private int width;
        private double y;
        private int height;

        public void setEx(int ex) {
            this.ex = ex;
        }

        public void setEy(double ey) {
            this.ey = ey;
        }

        public void setCenter(CenterEntity center) {
            this.center = center;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public void setY(double y) {
            this.y = y;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getEx() {
            return ex;
        }

        public double getEy() {
            return ey;
        }

        public CenterEntity getCenter() {
            return center;
        }

        public int getX() {
            return x;
        }

        public int getWidth() {
            return width;
        }

        public double getY() {
            return y;
        }

        public int getHeight() {
            return height;
        }

        public class CenterEntity {
            /**
             * x : 492
             * y : 260
             */
            private int x;
            private int y;

            public void setX(int x) {
                this.x = x;
            }

            public void setY(int y) {
                this.y = y;
            }

            public int getX() {
                return x;
            }

            public int getY() {
                return y;
            }
        }
    }

    public class ToEntity {
        /**
         * anchorIndex : 0
         * x : 720
         * y : 178
         * id : 97dd6717
         * direction : 4
         */
        private int anchorIndex;
        private int x;
        private int y;
        private String id;
        private int direction;

        public void setAnchorIndex(int anchorIndex) {
            this.anchorIndex = anchorIndex;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setDirection(int direction) {
            this.direction = direction;
        }

        public int getAnchorIndex() {
            return anchorIndex;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public String getId() {
            return id;
        }

        public int getDirection() {
            return direction;
        }
    }

    public class FontEntity {
        /**
         * textBaseline : middle
         * fontFamily : "Hiragino Sans GB", "Microsoft YaHei", "Helvetica Neue", Helvetica, Arial
         * color :
         * textAlign : center
         * background : #fff
         * fontSize : 18
         * lineHeight : 1.5
         * fontStyle : normal
         * fontWeight : normal
         */
        private String textBaseline;
        private String fontFamily;
        private String color;
        private String textAlign;
        private String background;
        private int fontSize;
        private double lineHeight;
        private String fontStyle;
        private String fontWeight;

        public void setTextBaseline(String textBaseline) {
            this.textBaseline = textBaseline;
        }

        public void setFontFamily(String fontFamily) {
            this.fontFamily = fontFamily;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setTextAlign(String textAlign) {
            this.textAlign = textAlign;
        }

        public void setBackground(String background) {
            this.background = background;
        }

        public void setFontSize(int fontSize) {
            this.fontSize = fontSize;
        }

        public void setLineHeight(double lineHeight) {
            this.lineHeight = lineHeight;
        }

        public void setFontStyle(String fontStyle) {
            this.fontStyle = fontStyle;
        }

        public void setFontWeight(String fontWeight) {
            this.fontWeight = fontWeight;
        }

        public String getTextBaseline() {
            return textBaseline;
        }

        public String getFontFamily() {
            return fontFamily;
        }

        public String getColor() {
            return color;
        }

        public String getTextAlign() {
            return textAlign;
        }

        public String getBackground() {
            return background;
        }

        public int getFontSize() {
            return fontSize;
        }

        public double getLineHeight() {
            return lineHeight;
        }

        public String getFontStyle() {
            return fontStyle;
        }

        public String getFontWeight() {
            return fontWeight;
        }
    }
}
