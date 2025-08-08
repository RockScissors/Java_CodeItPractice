package org.example.Head01_JavaProgrammingStart.example12;

import java.util.Arrays;

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


        //향상된 for문
        //좌측에 요구하는 것: "오른쪽 컬렉션에서 구성요소 딱 하나를 꺼냈을 때의 그 타입"

        for( int[] ints : matrix){
            System.out.println(ints);
        }
        //[I@6b884d57
        //[I@38af3868
        //이차원 배열의 구성 요소를 딱 하나 꺼내면 일차원 배열. 일차원 배열의 주소값
        //예를 들어 삼차원 배열의 구성 요소를 딱 하나 꺼내면 이차원 배열.
        //array[][][]라는 삼차원 배열의 경우, for( int[][] i : array )

    }
}
