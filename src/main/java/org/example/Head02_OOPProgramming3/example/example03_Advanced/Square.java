package org.example.Head02_OOPProgramming3.example.example03_Advanced;

public class Square implements Shape{
    private double side;

    public Square(double side){
        setSide(side);
        //setSide() 메소드에는 side 값이 0보다 커야 한다는 유효성 검사 로직이 이미
        //존재한다. 만약 생성자에서 this.side = side;를 사용한다면, 똑같은 유효성
        //검사 코드를 생성자 안에도 또 작성해야 한다.
    }

    public void setSide(double side){
        if(side <= 0){
            throw new IllegalArgumentException("side must be > 0");
        }
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
