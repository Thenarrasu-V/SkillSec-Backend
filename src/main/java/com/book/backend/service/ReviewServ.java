package com.book.backend.service;

import com.book.backend.Repo.ReviewRepo;
import com.book.backend.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServ {
    @Autowired
    ReviewRepo r;

    public Review addReview(Review review) {
        r.save(review);
        return review;
    }
}
