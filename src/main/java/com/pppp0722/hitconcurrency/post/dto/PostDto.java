package com.pppp0722.hitconcurrency.post.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class PostDto {

    private Long id;

    private String title;

    private String content;

    private int hits;
}
