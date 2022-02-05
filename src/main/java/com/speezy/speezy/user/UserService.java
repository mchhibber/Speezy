package com.speezy.speezy.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository userRepository; // using constructor injection so as to create objects in test not rely on context

    public UserService(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }
}
