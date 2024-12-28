package com.developer.blog.service;

import com.developer.blog.entity.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {

    Post savePost(Post post);

    List<Post> getAllPosts();
}
