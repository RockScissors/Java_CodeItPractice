package org.example.Head02_OOPProgramming3.example.example01_Advanced;

import java.util.Map;
import java.util.HashMap;

public class UserRepository {
    private final Map<String, String> userDb = new HashMap<>();

    public void register(String userId, String password){
        userDb.put(userId, password);
    }

    public String getUserPassword(String userId){
        return userDb.get(userId);
    }

    public boolean existUser(String userId){
        return userDb.containsKey(userId);
    }
}
