package com.book.backend.Repo;

import com.book.backend.model.Blog;
import com.book.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User,Long> {
    @Query("select u from User u where u.userName= :userName or u.email= :userName or u.name= :userName")
    User getByName(String userName);
}
