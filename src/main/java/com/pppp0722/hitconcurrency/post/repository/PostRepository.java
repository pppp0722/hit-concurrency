package com.pppp0722.hitconcurrency.post.repository;

import com.pppp0722.hitconcurrency.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface PostRepository extends JpaRepository<Post, Long> {

    @Modifying
    @Query("update Post p set p.hits = p.hits + 1 where p.id = :id")
    int updateHits(Long id);
}
