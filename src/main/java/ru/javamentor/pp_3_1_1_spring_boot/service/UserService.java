package ru.javamentor.pp_3_1_1_spring_boot.service;

import org.springframework.stereotype.Service;
import ru.javamentor.pp_3_1_1_spring_boot.model.User;
import ru.javamentor.pp_3_1_1_spring_boot.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public User addUser(User user) {
        return userRepository.save(user);
    }
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
    public User getById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

}
