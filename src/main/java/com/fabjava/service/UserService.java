package com.fabjava.service;

import com.fabjava.db.UserRepository;
import java.util.List;

public class UserService {
    private final UserRepository userRepository = new UserRepository();

    public void printUserEmails() {
        List<String> emails = userRepository.findAllEmails();
        for (String email : emails) {
            System.out.println("User Email: " + email);
        }
    }
}
