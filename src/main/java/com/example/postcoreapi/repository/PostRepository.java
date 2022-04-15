package com.example.postcoreapi.repository;

import com.example.postcoreapi.entity.PostEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<PostEntity, Long> {
    PostEntity getPostEntityByPostId(String PostId);

    List<PostEntity> getPostEntitiesBy();

    @Transactional
    void deletePostEntityByPostId(String PostId);
}
