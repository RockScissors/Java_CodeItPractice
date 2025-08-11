package org.example.Head02_OOPProgramming.exampleTeam;

public class Bicycle {
    private String brand;
    private double weight;
    private int gear;
    private String brake;
    private String wheel;
    private String chain;
    private String body;
    private String color;
    private String size;


    //생성자
    public Bicycle(String brand, double weight, int gear, String brake,
                   String wheel, String chain, String body, String color, String size){
        this.brand = brand; this.weight = weight; this.gear = gear;
        this.brake = brake; this.wheel = wheel; this.chain = chain;
        this.body = body; this.color = color; this.size = size;
    }


    //메소드
    public void chanegeChain(){
        System.out.println("체인을 변경합니다.");
    }

    public void chanegeHandleHeight(){
        System.out.println("핸들 높이를 조절합니다.");
    }

    public void brake(){
        System.out.println("정지! 브레이크를 밟습니다.");
    }

    public void pedals(){
        System.out.println("페달을 밟습니다.");
    }

    public void changeDirection(){
        System.out.println("방향을 전환합니다.");
    }

    public void horn(){
        System.out.println("딸랑! 경적을 울립니다.");
    }

    public void parking(){
        System.out.println("자전거를 주차합니다.");
    }

    public void riding(){
        System.out.println("자전거에 탑승합니다.");
    }

    public void trick(){
        System.out.println("자전거 묘기를 부립니다.");
    }

    @Override
    public String toString() {
        return "Bicycle\n[" +
                "brand='" + brand + '\'' +
                ", weight=" + weight +
                ", gear=" + gear +
                ", brake='" + brake + '\'' +
                "\n" +
                ", wheel='" + wheel + '\'' +
                ", chain='" + chain + '\'' +
                ", body='" + body + '\'' +
                "\n" +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ']';
    }
}
