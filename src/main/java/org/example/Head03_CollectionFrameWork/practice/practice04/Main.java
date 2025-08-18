package org.example.Head03_CollectionFrameWork.practice.practice04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while(run){
            System.out.println("\n=== 메뉴 ===");
            System.out.println("1. 학생 등록");
            System.out.println("2. 학생 삭제");
            System.out.println("3. 학생 목록 보기");
            System.out.println("4. 학생 점수 조회");
            System.out.println("5. 종료");
            System.out.print("선택: ");

            int menu = scanner.nextInt();
            scanner.nextLine(); //버퍼 제거

            switch (menu) {
                case 1:
                    System.out.print("이름 입력: ");
                    String name = scanner.nextLine();
                    System.out.print("나이 입력: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); //버퍼 제거
                    System.out.print("학번 입력: ");
                    String studentId = scanner.nextLine();
                    System.out.print("점수 입력: ");
                    int score = scanner.nextInt();
                    scanner.nextLine(); //버퍼 제거

                    Student newStudent = new Student(name, age, studentId);
                    manager.addStudent(newStudent, score);
                    break;

                case 2:
                    System.out.print("삭제할 학생 이름 입력: ");
                    String delName = scanner.nextLine();
                    manager.removeStudent(delName);
                    break;

                case 3:
                    manager.printAllStudents();
                    break;

                case 4:
                    System.out.print("조회할 학생 이름 입력: ");
                    String searchName = scanner.nextLine();
                    manager.printScore(searchName);
                    break;

                case 5:
                    run = false;
                    System.out.println("[Info] 프로그램을 종료합니다. ");
                    break;

                default:
                    System.out.println("[Error] 잘못된 입력입니다.");
            }
        }


    }
}
