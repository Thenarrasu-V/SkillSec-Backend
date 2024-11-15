package com.book.backend.controller;

import com.book.backend.model.User;
import com.book.backend.service.UserServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserServ s;


    @PostMapping("/sign-up")
    public ResponseEntity<String> signUp(@RequestBody User user) {
        String response = s.addUser(user);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }


    @PostMapping("/sign-in")
    public ResponseEntity<User> login(@RequestBody User user) {
        User response = s.login(user);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
    @PostMapping("/add-book-marks")
    public ResponseEntity<User>addBookMarks(@RequestParam Long uId,@RequestParam Long blogId){
        User response=s.addBookMarks(uId,blogId);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
