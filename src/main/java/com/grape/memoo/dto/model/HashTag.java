package com.grape.memoo.dto.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HashTag {
    @Id
    private String id;

    private String name;
    private Long popularity;
    private LocalDateTime startDateTime;
    private LocalDateTime lastUploadedDateTime;
}
