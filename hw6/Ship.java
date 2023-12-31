import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

abstract public class Ship {
    protected int x,y,width,length;
    protected String name;
    protected boolean filled;

    public Ship () {
        filled = false;
    }

    public void drawShip(Graphics g) {

    }

    public void drawShip(Graphics g, int frameNumber) {
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getWidth() {
        return this.width;
    }

    public int getLength() {
        return this.length;
    }

    public void changeX(int value) {
        this.x += value;
    }

    public void changeY(int value) {
        this.y += value;
    }

    public void setValues(int x,int y, int width, int length) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.length = length;
    }

    public boolean isClicked(MouseEvent e, int frameNumber) {
        return false;
    }

    public boolean isSelected() {
        return filled;
    }

    public void setSelected(boolean input) {
        filled = input;
    }

    public boolean intersects(Ship ship, int frameNumber) {
        return false;
    }

    public static boolean testIntersection(Shape shapeA, Shape shapeB) {
        Area areaA = new Area(shapeA);
        areaA.intersect(new Area(shapeB));
        return !areaA.isEmpty();
     }

}