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

    }
}
