package org.example.Head03_CollectionFrameWork.practice.practice02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Korea");
        hashSet.add("Japan");
        hashSet.add("China");
        hashSet.add("Korea"); //중복 추가

        System.out.println("After add: " + hashSet.toString());

        System.out.println("Contains 'Japan?: " + hashSet.contains("Japan"));

        //remove()는 객체 삭제를 시도하고 결과에 따라 boolean 값을 반환한다.
        hashSet.remove("China"); //"China" 객체 존재, 삭제 후 true 반환
        hashSet.remove("USA"); //"USA" 객체 존재 X, false 반환
        System.out.println("After remove 'China': " + hashSet.toString());

        System.out.println("Set size: " + hashSet.size());

        hashSet.clear();
        System.out.println("After clear: " + hashSet.toString());
    }
}
