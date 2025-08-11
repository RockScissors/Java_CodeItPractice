package org.example.Head02_OOPProgramming.example04;

public class VarargsExample {
    public static void main(String[] args) {
        Example ex = new Example();
        ex.print(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
}
    class Example{
        void print(int a, int b){
            System.out.println("fixed two ints");
        }

        //가변 변수
        void print(int... nums){
            System.out.println("varargs ints");
        }
    }
