package com.lt.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class IconRectEntity {
    /**
     * ex : 254
     * ey : 344.5
     * center : {"x":159,"y":335.75}
     * x : 64
     * width : 190
     * y : 327
     * height : 17.5
     */
    private int ex;
    private double ey;
    private CenterEntity center;
    private int x;
    private int width;
    private int y;
    private double height;

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

    public void setY(int y) {
        this.y = y;
    }

    public void setHeight(double height) {
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

    public int getY() {
        return y;
    }

    public double getHeight() {
        return height;
    }

    public class CenterEntity {
        /**
         * x : 159
         * y : 335.75
         */
        private int x;
        private double y;

        public void setX(int x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public double getY() {
            return y;
        }
    }
}
