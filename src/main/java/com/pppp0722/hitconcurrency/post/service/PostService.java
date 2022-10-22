package com.pppp0722.hitconcurrency.post.service;

import com.pppp0722.hitconcurrency.post.dto.PostDto;
import com.pppp0722.hitconcurrency.post.entity.Post;
import com.pppp0722.hitconcurrency.post.mapper.PostMapper;
import com.pppp0722.hitconcurrency.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class PostService {

    private final PostRepository postRepository;

    public Long createPost(PostDto postDto) {
        Post post = PostMapper.INSTANCE.toEntity(postDto);

        return postRepository.save(post).getId();
    }

    @Transactional(readOnly = true)
    public PostDto getPost(Long id) {
        Post post = postRepository.findById(id)
            .orElseThrow(RuntimeException::new);

        return PostMapper.INSTANCE.toDto(post);
    }
}
