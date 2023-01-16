package com.watchflix.userservice.controller;
import com.watchflix.userservice.model.User;
import com.watchflix.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public  List<User> findAll(){
    return userRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody User user){
     userRepository.save(user);
    }
}
