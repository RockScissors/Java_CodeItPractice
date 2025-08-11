package org.example.Head02_OOPProgramming.exampleTeam;

public class Main {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle("자이언트", 10, 3,
                "디스크 브레이크", "탄소 섬유 바퀴", "KMC X12",
                "프리허브 바디", "BLUE", "M");

        bike.riding();
        bike.pedals();
        bike.changeDirection();
        bike.trick();
        bike.horn();
        bike.brake();

        System.out.println("\n----------------------------\n");
        System.out.println(bike.toString());
    }
}
