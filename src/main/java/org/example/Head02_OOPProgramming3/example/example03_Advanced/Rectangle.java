package org.example.Head02_OOPProgramming3.example.example03_Advanced;

public class Rectangle implements Shape{
    private double width;
    private double height;

    //생성자를 하나라도 만들면 컴파일러는 자동으로 기본 생성자를 생성해주지 않는다.
    public Rectangle(double width, double height){
        setWidth(width);
        setHeight(height);
    }

    //"가로, 세로" 설정을 요구하는 setWdith(), setHeight()는 Rectangle에만
    //존재하므로, 정사각형이 직사각형의 세부 동작을 깨뜨리는 일이 사라진다.
    public void setWidth(double width){
        if(width <= 0){
            throw new IllegalArgumentException("Width must be > 0");
        }
        this.width = width;
    }

    public void setHeight(double height){
        if(height <= 0){
            throw new IllegalArgumentException("height must be > 0");
        }
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
