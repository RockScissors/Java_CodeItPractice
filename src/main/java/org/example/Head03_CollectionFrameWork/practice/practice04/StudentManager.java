package org.example.Head03_CollectionFrameWork.practice.practice04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.List;

public class StudentManager {
    private List<Student> students;
    private Set<String> studentNames;
    private Map<String, Integer> scoreMap;

    public StudentManager(){
        students = new ArrayList<>();
        studentNames = new HashSet<>();
        scoreMap = new HashMap<>();
    }

    public void addStudent(Student student, int score){
        //중복 이름 체크
        if(studentNames.contains(student.getName())){
            //List.contains() 가 아닌 Set.contains(HashSet)를 사용한 이유
            //탐색 효율성(성능)과 코드의 의도(가독성)
            //List로 탐색 시 맨 처음 인덱스부터 하나하나 확인.
            //HashSet로 탐색 시 해시코드를 이용해 데이터 보관. -> O(1)의 시간복잡도
            //또한, Set으로 선언된 코드를 보며 '중복 없이 관리하는 집합이군'이라고
            //변수의 역할과 목적을 즉시 파악할 수 있다.
            System.out.println("[Error] 이미 존재하는 학생 이름입니다.");
            return;
        }
        //등록
        students.add(student);
        studentNames.add(student.getName());
        scoreMap.put(student.getName(), score);
        System.out.println("[Info] 새로운 학생이 등록되었습니다: \n" + student);
    }

    public void removeStudent(String name){
        //이름을 통해 학생 찾기
        Student target = null;
        for(Student s : students){
            if(s.getName().equals(name)){
                target = s;
                break;
            }
        }

        //해당 학생 리스트에 존재하는 경우 학생 삭제, 존재하지 않는 경우 에러 메시지 출력
        if(target != null){
            students.remove(target);
            studentNames.remove(name);
            scoreMap.remove(name);
            System.out.println("[Info] 학생이 삭제되었습니다: " + name);
        } else {
            System.out.println("[Error] 해당 이름의 학생을 찾을 수 없습니다.");
        }
    }

    //모든 학생 정보 출력
    public void printAllStudents(){
        System.out.println("=== 학생 목록 ===");
        for(Student s : students){
            System.out.println(s);
        }
    }

    //점수 출력
    public void printScore(String name){
        Integer score = scoreMap.get(name);
        if(score != null){
            System.out.println("[Info] " + name + "의 점수: " + score);
        } else {
            System.out.println("[Error] 점수를 찾을 수 없습니다.");
        }
    }
}
