package org.example.Head01_JavaProgrammingStart.example04;

public class ForLoopExample {
    public static void main(String[] args) {
        int[] scores = {90, 85, 78};

        for(int i : scores){
            System.out.println("점수: " + i);
        }

    }
}
