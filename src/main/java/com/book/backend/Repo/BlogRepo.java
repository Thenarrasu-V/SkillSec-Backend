package com.book.backend.Repo;

import com.book.backend.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BlogRepo extends JpaRepository<Blog,Long> {
    @Query("select blg from Blog blg where blg.userId= :uId")
    List<Blog> getBlogByUserId(Long uId);
}
