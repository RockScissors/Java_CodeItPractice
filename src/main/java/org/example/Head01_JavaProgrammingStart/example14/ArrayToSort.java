package org.example.Head01_JavaProgrammingStart.example14;

import java.util.Arrays;

public class ArrayToSort {
    public static void main(String[] args) {
        int[] data = {5, 2, 8};

        Arrays.sort(data); //배열 정렬

        System.out.println(Arrays.toString(data)); //배열 전체 문자열로 출력
        //출력:  [2, 5, 8]
    }
}
