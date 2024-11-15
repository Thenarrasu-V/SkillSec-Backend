package com.book.backend.model;

import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "blog")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;



    private Long userId;
    private String userName;
    
    private String title;
    private String content;
    private Integer likes; // Changed to Integer for countable values
    private Integer views; // Changed to Integer for countable values

    @ElementCollection // Required to store list of basic types
    private List<Long> reviews;

    // Getters and setters

    public Long getId() {
        return id;
    }
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String title) {
        this.userName = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public List<Long> getReviews() {
        return reviews;
    }

    public void setReviews(List<Long> reviews) {
        this.reviews = reviews;
    }
}
