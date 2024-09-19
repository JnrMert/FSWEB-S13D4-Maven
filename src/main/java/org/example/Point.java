package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }
    public double distance(Point p) {
        return Math.sqrt((p.getX() - this.x) * (p.getX() - this.x) + (p.getY() - this.y) * (p.getY() - this.y));
    }
    public double distance(int a, int b) {
        return Math.sqrt((a - this.x) * (a - this.x) + (b - this.y) * (b - this.y));
    }

}
