package com.lt.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class FontEntity {
    /**
     * textBaseline : middle
     * fontFamily : "Hiragino Sans GB", "Microsoft YaHei", "Helvetica Neue", Helvetica, Arial
     * color : #222
     * textAlign : center
     * background :
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