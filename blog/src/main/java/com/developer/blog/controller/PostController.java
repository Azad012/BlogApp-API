package com.developer.blog.controller;

import com.developer.blog.entity.Post;
import com.developer.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/getallpost")
    List<Post> getAllPost() {
        return postService.getAllPosts();
    }

    @PostMapping("/savepost")
    Post savePost(@RequestBody Post post) {
        return postService.savePost(post);
    }
}
