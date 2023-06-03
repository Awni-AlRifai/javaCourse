package org.example.oop.constructos;

public class Rectangle {
    private int x;
    private int y;
    private  int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        this.x =0;
        this.y = 0;
    }

    public Rectangle() {
        this.width = 0;
        this.height = 0;
        this.x =0;
        this.y = 0;
    }
}
