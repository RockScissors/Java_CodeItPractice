package org.example.Head03_CollectionFrameWork.practice.practice03;

import java.util.Map;
import java.util.HashMap;

public class HashMapExample2 {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        //키-값 쌍 추가
        scores.put("Park", 95);
        scores.put("Kim", 90);
        scores.put("Lee", 85);
        System.out.println("After put: " + scores);

        //기존 키에 다른 값 할당
        scores.put("Lee", 88);
        System.out.println("After updating 'Lee': " + scores);

        //특정 키의 값 조회
        System.out.println("Park's score: " + scores.get("Park"));

        //키 존재 여부
        System.out.println("Contains 'Kim'? " + scores.containsKey("Kim"));

        //요소 제거
        scores.remove("Kim");
        System.out.println("After remove 'Kim': " + scores);

        //모든 키 조회
        System.out.println("All keys: " + scores.keySet());
    }
}
