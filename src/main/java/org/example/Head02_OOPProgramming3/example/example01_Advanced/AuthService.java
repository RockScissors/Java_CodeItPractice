package org.example.Head02_OOPProgramming3.example.example01_Advanced;

public class AuthService {
    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public boolean login(String userId, String password){
        if(!userRepository.existUser(userId)){
            return false;
        }
        return userRepository.getUserPassword(userId).equals(password);
    }

    public boolean checkAdminPrivileges(String userId){
        return "admin".equals(userId);
    }
}
