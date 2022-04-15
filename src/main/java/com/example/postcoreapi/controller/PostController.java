package com.example.postcoreapi.controller;

import com.example.postcoreapi.model.PostRequest;
import com.example.postcoreapi.model.PostResponse;
import com.example.postcoreapi.service.current.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    PostService postService;

    @GetMapping("/check")
    public String check() {
        return "post-core-api is working";
    }

    @PostMapping
    public PostResponse createPost(@RequestBody PostRequest postRequest) {
        return postService.createPost(postRequest);
    }

    @GetMapping
    public PostResponse getPostById(@RequestParam String postId) {
        return postService.getPostById(postId);
    }

    @PutMapping PostResponse updatePostById(@RequestParam String postId,
                                            @RequestBody PostRequest postRequest) {
        postRequest.setPostId(postId);
        return postService.updatePost(postRequest);
    }

    @GetMapping("/all")
    public List<PostResponse> getAllPosts() {
        return postService.getAllPosts();
    }

    @DeleteMapping
    public String deletePostById(@RequestParam String postId) {
        postService.deletePostById(postId);
        return "successfully deleted";
    }
}
