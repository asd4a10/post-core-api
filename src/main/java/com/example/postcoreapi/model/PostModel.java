package com.example.postcoreapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostModel {
    private String postId;
    @NotNull
    private String clientId;
    @NotNull
    private String postRecipientId;
    @NotNull
    @Size(min=1, max=10, message = "name should be 1-9 letters long")
    private String postItem;
    private String status;
}
