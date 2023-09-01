package org.area;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle2x5 = new Rectangle(2.4,5.8);
        Rectangle rectangle3x6 = new Rectangle(3.7,6.28);

        System.out.println(rectangle2x5.calculateArea());  
        System.out.println(rectangle3x6.calculateArea());

    }
}
