package com.grape.memoo.dto.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.Binary;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Meme {
    @Id
    private String id;

    private Binary image;
    private Integer likesAmount;
    private Integer dislikesAmount;
    private String description;

    private List<HashTag> hashTags;
}
