package com.pppp0722.hitconcurrency.post.repository;

import com.pppp0722.hitconcurrency.post.entity.Post;
import java.util.Optional;
import javax.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface PostRepository extends JpaRepository<Post, Long> {

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Query("SELECT p FROM Post p WHERE p.id = :id")
    Optional<Post> findByIdForUpdate(Long id);

    @Modifying
    @Query("UPDATE Post p SET p.hits = p.hits + 1 WHERE p.id = :id")
    int updateHits(Long id);
}
