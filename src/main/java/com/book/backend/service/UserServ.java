package com.book.backend.service;

import com.book.backend.Repo.UserRepo;
import com.book.backend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServ {
    @Autowired
    UserRepo r;

    public String addUser(User u) {
        u.setBookMarks(new ArrayList<Long>());
        r.save(u);
        return "success";
    }

    public User login(User user) {
        User db_user=r.getByName(user.getName());
        if(db_user.getPass().equals(user.getPass())){
            return db_user;
        }
        else{
            return null;
        }
    }

    public User addBookMarks(Long uId, Long blogId) {
        User db_user=r.getReferenceById(uId);
        if(db_user!=null){
            db_user.getBookMarks().add(blogId);
            r.save(db_user);
        }
        return db_user;
    }
}
