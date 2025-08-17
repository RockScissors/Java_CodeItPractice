package org.example.Head02_OOPProgramming3.example.example03_Advanced;

public class LspTestImproved {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 10);
        System.out.println("Rectangle's Area: " + rect.getArea());

        Shape square = new Square(5);
        System.out.println("Square's Area: " + square.getArea());

    }
}
