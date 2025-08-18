package org.example.Head03_CollectionFrameWork.practice.practice02;

import java.util.Set;
import java.util.HashSet;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();

        //요소 추가
        countries.add("Korea");
        countries.add("Japan");
        countries.add("China");
        countries.add("Korea"); // 중복된 요소는 저장 X
        System.out.println("After add: " + countries);

        //요소 포함 여부 확인
        System.out.println("Contains 'Japan' ? " + countries.contains("Japan"));

        //요소 제거
        countries.remove("China");
        System.out.println("After remove 'China': " + countries);

        //개수 확인
        System.out.println("Set size: " + countries.size());

        //전체 제거
        countries.clear();
        System.out.println("After clear: " + countries);
    }
}
