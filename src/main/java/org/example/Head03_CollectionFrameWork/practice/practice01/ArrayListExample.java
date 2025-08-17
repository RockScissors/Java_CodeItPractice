package org.example.Head03_CollectionFrameWork.practice.practice01;

import java.util.List;
import java.util.ArrayList;
//JFC : List 인터페이스 (순서 O, 인덱스 통해 요소 접근, 중복 요소 O)
//+) LinkedList의 노드에는 인덱스라는 데이터가 존재 X. 그렇기에 LinkedList의 인덱스는
//저장된 값이 아니라, 호출될 때마다 실시간으로 세는 값이다.
public class ArrayListExample {
    public static void main(String[] args) {
        String[] stringArray = {"Apple", "Banana", "Cherry"};
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");


        //println은 내부적으로 알아서 객체의 toString() 메소드를 호출해 문자열로
        //바꾼 뒤에, 결과를 화면에 출력해준다는 약속을 가지고 있음.
        //즉 System.out.println(arrayList);라는 코드를 쓰면,
        //자바는 뒤에서 자동으로 System.out.println(arrayList.toString()); 으로 바꿔 실행
        System.out.println("After add: " + arrayList);

        System.out.println("First Fruit: " + arrayList.get(0));

        arrayList.remove(1);
        System.out.println("After remove index 1: " + arrayList);

        System.out.println("List size: " + arrayList.size());

        arrayList.clear();
        System.out.println("After clear: " + arrayList);
    }
}
