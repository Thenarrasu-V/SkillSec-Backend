package com.book.backend.Repo;

import com.book.backend.model.Blog;
import com.book.backend.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MessageRepo extends JpaRepository<Message,Long> {
    @Query("select msg from Message msg where msg.userId= :uId and msg.blogId= :blogId")
    List<Message> findMsg(Long uId, Long blogId);
}
