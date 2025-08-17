package org.example.Head02_OOPProgramming3.example.example01;

import java.util.Map;
import java.util.HashMap;


//SRP(Single Responsibility Principle - 단일 책임 원칙)
//클래스는 단 한 가지의 변경 이유만 가져야 한다.
public class UserService {
    private final Map<String ,String> userDb = new HashMap<>();

    //사용자 등록
    public void register(String userId, String password){
        //map.put( , ) : 맵 추가
        userDb.put(userId, password);
    }

    //사용자 비밀번호 조회
    public String getUserPassword(String userId){
        return userDb.get(userId);
    }

    //사용자 인증
    public boolean login(String userId, String password){
        if( !userDb.containsKey(userId) ){
            return false;
        }
        return userDb.get(userId).equals(password);
    }

    //관리자 권한 확인
    public boolean checkAdminPrivileges(String userId){
        return "admin".equals(userId);
    }

}
