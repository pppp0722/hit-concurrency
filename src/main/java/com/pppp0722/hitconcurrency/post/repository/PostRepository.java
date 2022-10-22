package com.pppp0722.hitconcurrency.post.repository;

import com.pppp0722.hitconcurrency.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
