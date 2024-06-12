package ru.evilcorp.Project_5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers(){
        userRepository.save(new User(null, "Evgeniy","fbwsdjh@mail.ru"));
        userRepository.save(new User(null, "Dmitriy","rwr@mail.ru"));
        userRepository.save(new User(null, "Alexander","fwetewrt@mail.ru"));
        return userRepository.findAll();
    }

    public User getUserById(Long id){
        return userRepository.findById(id).get();
    }
}
