package com.grape.memoo.dto.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserModel {
    @Id
    private String id;

    private String name;
    private LocalDateTime startDateTime;
    private List<Meme> memes;
    private List<Meme> likedMemes;
    private List<Meme> dislikedMemes;
    private List<HashTag> likedHashTags;
    private List<HashTag> dislikedHashTags;

    public static void validate(UserModel userModel) {
        if (StringUtils.isEmpty(userModel.name)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Name is empty");
        }
    }
}
