package com.lt.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class FullIconRectEntity {
    /**
     * ex : 254
     * ey : 357
     * center : {"x":159,"y":342}
     * x : 64
     * width : 190
     * y : 327
     * height : 30
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
         * x : 159
         * y : 342
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