package oop.box;

public class BoxSmart {
    private double height;
    private double width;
    private double depth;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double volume(){
        return this.height * this.width * this.depth;

    }

    @Override
    public String toString(){
        return "height = " + this.height + "\n" +
                "width = " + this.width + "\n" +
                "depth = " + this.depth ;
    }
}
