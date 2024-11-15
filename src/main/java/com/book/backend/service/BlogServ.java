package com.book.backend.service;

import com.book.backend.Repo.BlogRepo;
import com.book.backend.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServ {
    @Autowired
    BlogRepo r;

    public Blog addBlog(Blog blg) {
        r.save(blg);
        return blg;
    }

    public List<Blog> getBlogs(Long uId) {
        return r.getBlogByUserId(uId);
    }

	public List<Blog> geAllBlogs() {
		return r.findAll();
	}

	public Blog getById(Long id) {
		return r.getById(id);
	}
}
