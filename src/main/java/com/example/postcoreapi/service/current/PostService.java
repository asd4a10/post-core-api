package com.example.postcoreapi.service.current;

import com.example.postcoreapi.model.PostRequest;
import com.example.postcoreapi.model.PostResponse;

import java.util.List;

public interface PostService {
    PostResponse createPost(PostRequest postRequest);

    List<PostResponse> getAllPosts();

    PostResponse updatePost(PostRequest postRequest);

    PostResponse getPostById(String postId);

    void deletePostById(String postId);
}
