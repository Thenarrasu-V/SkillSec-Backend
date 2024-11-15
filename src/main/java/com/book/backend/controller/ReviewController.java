package com.book.backend.controller;

import com.book.backend.model.Message;
import com.book.backend.model.Review;
import com.book.backend.service.ReviewServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/review")
public class ReviewController {
    @Autowired
    ReviewServ s;

    @PostMapping("/add")
    public ResponseEntity<Review> signUp(@RequestBody Review review) {
        Review response = s.addReview(review);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}
