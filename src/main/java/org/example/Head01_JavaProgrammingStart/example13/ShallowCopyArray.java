package org.example.Head01_JavaProgrammingStart.example13;

public class ShallowCopyArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] copy = original;

        copy[0] = 100;
        System.out.println(copy[0]); //100
        System.out.println(original[0]);
        //두 배열은 같은 주소를 참조하고 있기 때문에, 100


        String str1 = "문자열";
        String str2 = "문자열";

        System.out.println("str1 == str2 : " + (str1 == str2));
        //false. String은 참조형 객체기에, "문자열"이라는 값이 아닌 주소값을 비교한 것.

        //문자열을 비교하고 싶다면
        System.out.println(str1.equals(str2));
    }
}
