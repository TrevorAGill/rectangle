package models;

public class Rectangle {

    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        }

    public int getHeight() {
        return this.height;
    }
    public int getWidth() {
        return this.width;
    }
    public boolean isSquare() {
        return height == width;
    }
}

//1.should be able to create an object of Rectangle class given 2 length arguments
//2. should be able to evaluate and return if the rectangle is also a square