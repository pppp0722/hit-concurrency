package com.pppp0722.hitconcurrency.post.mapper;

import com.pppp0722.hitconcurrency.post.dto.PostDto;
import com.pppp0722.hitconcurrency.post.entity.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PostMapper {

    PostMapper INSTANCE = Mappers.getMapper(PostMapper.class);

    @Mapping(target = "id", ignore = true)
    Post toEntity(PostDto postDto);

    PostDto toDto(Post post);
}
