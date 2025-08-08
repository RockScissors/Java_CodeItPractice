package org.example.Head01_JavaProgrammingStart.example13;

public class DeepCopyArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        //복사하고 싶은 원래 배열과 동일한 길이로 새 copy배열 생성
        int[] copy = new int[original.length];

        for(int i = 0; i < original.length; i++){
            copy[i] = original[i];
            //기존 배열의 요소를 차례대로 카피에 넣기
        }

        copy[0] = 100;
        System.out.println(original[0]); //1 -> 영향 X

    }
}
