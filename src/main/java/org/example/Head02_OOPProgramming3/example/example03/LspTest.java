package org.example.Head02_OOPProgramming3.example.example03;

public class LspTest {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setWidth(5);
        rect.setHeight(10);

        //예상: 직사각형의 넓이 - 50
        System.out.println("Rectangle Area: " + rect.getArea());

        //LSP 관점에서 Rectangle 타입 자리에 Square 객체 대입
        Rectangle square = new Square();
        square.setWidth(5);
        square.setHeight(10);

        //개발자는 "직사각형"이라고 생각하고 area=50을 기대할 수 있으나,
        //실제로는 정사각형 로직 때문에 width = height = 10이 되어버림.
        System.out.println("Square Area: " + square.getArea());
    }
}
