package com.book.backend.controller;

import com.book.backend.model.Blog;
import com.book.backend.model.Message;
import com.book.backend.service.BlogServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blog")
public class BlogController {
    @Autowired
    BlogServ s;


    @PostMapping("/add")
    public ResponseEntity<Blog> signUp(@RequestBody Blog blg ) {
        Blog response = s.addBlog(blg);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/get-by-user-id")
    public ResponseEntity<List<Blog>> getBlogsById(@RequestParam Long userId) {
        List<Blog> response = s.getBlogs(userId);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
    
    @GetMapping("/get-all")
    public ResponseEntity<List<Blog>> getAllBlogs() {
        List<Blog> response = s.geAllBlogs();
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<Blog> getBlogById(@PathVariable Long id) {
        Blog response = s.getById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
