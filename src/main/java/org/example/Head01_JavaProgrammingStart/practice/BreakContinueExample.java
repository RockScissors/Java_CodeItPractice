package org.example.Head01_JavaProgrammingStart.practice;

public class BreakContinueExample {
    public static void main(String[] args) {
        for(int i = 1; i<=5; i++){
            if(i == 3) continue;
            if(i == 4) break;
            System.out.println(i);

            //예상 출력: 1 2

        }
    }
}
