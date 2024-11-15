package com.book.backend.Repo;

import com.book.backend.model.Blog;
import com.book.backend.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepo extends JpaRepository<Review,Long> {
}
