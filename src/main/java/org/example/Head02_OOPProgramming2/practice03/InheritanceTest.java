package org.example.Head02_OOPProgramming2.practice03;

public class InheritanceTest {
    public static void main(String[] args) {
        User u = new PersonalUser("U001", "Alice", "alice@example.com");
        User u2 = new BusinessUser("U002", "James", "Google");

        u.printUserInfo();
        System.out.println();
        u2.printUserInfo();
    }
}
