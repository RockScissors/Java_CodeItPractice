package org.example.Head01_JavaProgrammingStart.example11;

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] animals = {"Dog", "Cat", "Wolf", "Tiger", "Lion",
        "Zebra", "Monkey", "Rabbit"};

        //for문 사용
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }

        System.out.println("\n------------------\n"); //구분

        //향상된 for문 사용
        for (String a : animals) {
            System.out.println(a);
        }
    }
}
