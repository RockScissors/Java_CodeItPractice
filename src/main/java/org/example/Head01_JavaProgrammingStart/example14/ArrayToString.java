package org.example.Head01_JavaProgrammingStart.example14;

import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15};

        //배열 전체를 문자열로 변환
        //출력:   [5, 10, 15]
        System.out.println(Arrays.toString(arr));
    }
}
