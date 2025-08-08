package org.example.Head01_JavaProgrammingStart.example12;

public class TwoArray {
    public static void main(String[] args) {

        //2차원 배열
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for(int i =0; i < matrix.length; i++){
            for(int j=0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("--------");

        //향상된 for문
        for( int[] ints : matrix ){
            for(int anInt : ints){
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        for( int[] ints : matrix){
            System.out.println(ints);
        }
    }
}
