package com.example.postcoreapi.service.deprecated;

import com.example.postcoreapi.model.PostModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
public class PostServiceImplOld implements PostServiceOld {
    private static final HashMap<String, PostModel> postMap = new HashMap<>();

    static {
        PostModel postModel1 = new PostModel(UUID.randomUUID().toString(), "id1",
                "id2", "Car", "in country of destination");
        PostModel postModel2 = new PostModel(UUID.randomUUID().toString(), "id2","id3", "BATMAN", "arrived");
        PostModel postModel3 = new PostModel(UUID.randomUUID().toString(), "id3",
                "id1", "Spider-Man", "waits for sending");
        postMap.put(postModel1.getPostId(), postModel1);
        postMap.put(postModel2.getPostId(), postModel2);
        postMap.put(postModel3.getPostId(), postModel3);
    }

    @Override
    public void createPost(PostModel postModel) {
        postModel.setPostId(UUID.randomUUID().toString());
        postMap.put(postModel.getPostId(),postModel);
    }

    @Override
    public List<PostModel> getAllPosts() {
        return new ArrayList<>(postMap.values());
    }

    @Override
    public PostModel getPostById(String postId) {
        return postMap.get(postId);
    }

    @Override
    public void updatePostById(String postId, PostModel postModel) {
        postModel.setPostId(postId);
        postMap.put(postModel.getPostId(),postModel);
    }

    @Override
    public void deletePostById(String postId) {
        postMap.remove(postId);
    }
}
