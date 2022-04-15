package com.example.postcoreapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "posts")
public class PostEntity {
    @Id
    @GeneratedValue
    private Long Id;
    @Column(unique = true)
    private String postId;
    @Column(nullable = false, length = 50)
    private String clientId;
    @Column(nullable = false, length = 50)
    private String postRecipientId;
    @Column(nullable = false, length = 50)
    private String postItem;
    @Column(nullable = false, length = 50)
    private String status;
}
