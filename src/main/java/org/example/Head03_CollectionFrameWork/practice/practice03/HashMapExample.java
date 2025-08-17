package org.example.Head03_CollectionFrameWork.practice.practice03;

import java.util.Map;
import java.util.HashMap;

//JFC : Map 인터페이스 (키-값으로 데이터 저장. 키는 중복 X)
//이미 존재하는 키로 다시 put() 호출 시 값을 덮어쓴다.
public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<String, Integer>();

        hashMap.put("Park", 95);
        hashMap.put("Kim", 90);
        hashMap.put("Lee", 85);
        System.out.println("After put: " + hashMap);

        hashMap.put("Lee", 88);
        System.out.println("After Updating 'Lee': " + hashMap);

        System.out.println("Park's score: " + hashMap.get("Park"));

        System.out.println("Contains 'Kim'?: " + hashMap.containsKey("Kim"));

        hashMap.remove("Kim");
        System.out.println("After remove 'Kim': " + hashMap);

        System.out.println("All keys: " + hashMap.keySet());
        // = System.out.println("All keys: " + hashMap.keySet().toString());
    }
}
