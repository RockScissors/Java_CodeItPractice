package org.example.Head02_OOPProgramming3.example.example01_Advanced;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    //새 사용자 등록
    public void registerUser(String userId, String password){
        //유효성 검사, 비즈니스 로직 등
        userRepository.register(userId, password);
        System.out.println("사용자 [" + userId + "] 등록 완료");
    }

    public String findPassword(String userId){
        return userRepository.getUserPassword(userId);
    }
}
