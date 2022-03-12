package com.example.postcoreapi.service;

import com.example.postcoreapi.model.PostModel;

import java.util.List;

public interface PostService {
//    Метод createPost() для создания заказа посылки
//    Метод getAllPosts() для вывода списка посылок
//    Метод getPostById() для вывода данных о посылке по ID
//    Метод updatePostById() для обновления данных о посылке по ID
//    Метод deletePostById() для удаления данных о посылке по ID
     void createPost(PostModel postModel);

     List<PostModel> getAllPosts();

     PostModel getPostById(String postId);

     void updatePostById(String postId, PostModel postModel);

     void deletePostById(String postId);

}
