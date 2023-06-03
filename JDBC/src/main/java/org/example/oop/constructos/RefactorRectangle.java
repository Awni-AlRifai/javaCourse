package org.example.oop.constructos;

public class RefactorRectangle {

        private int x;
        private int y;
        private  int width;
        private int height;

    public RefactorRectangle () {
        //calls the second constructor
        this(0,0);
    }
    public RefactorRectangle(int width, int height) {
            this(0,0,width,height); // calls the 3rd constructor
        }

    public RefactorRectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    }


