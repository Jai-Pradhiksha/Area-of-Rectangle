package org.area;

public class Rectangle {
    double length;
    double breadth;
    public Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    double calculateArea(){
        return length * breadth;
    }
    double calculatePerimeter(){
        return 2 * (length + breadth);
    }
}
