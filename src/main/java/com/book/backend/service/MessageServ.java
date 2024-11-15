package com.book.backend.service;

import com.book.backend.Repo.MessageRepo;
import com.book.backend.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServ {
    @Autowired
    MessageRepo r;

    public Message addMsg(Message msg) {
            r.save(msg);
            return msg;
    }

    public List<Message> getMsg() {
        return r.findAll();
    }
}
