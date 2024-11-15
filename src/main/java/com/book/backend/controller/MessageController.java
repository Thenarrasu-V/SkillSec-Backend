package com.book.backend.controller;

import com.book.backend.model.Message;
import com.book.backend.model.User;
import com.book.backend.service.MessageServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/msg")
public class MessageController {
    @Autowired
    MessageServ s;


    @PostMapping("/add")
    public ResponseEntity<Message> signUp(@RequestBody Message msg ) {
        Message response = s.addMsg(msg);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Message>> signUp() {
        List<Message> response = s.getMsg();
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
