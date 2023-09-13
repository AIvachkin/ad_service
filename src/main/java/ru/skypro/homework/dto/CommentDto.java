package ru.skypro.homework.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * DTO - комментарий
 * */
@Data
@NoArgsConstructor
public class CommentDto {

    /**
     * id автора комментария
     * */
    @JsonProperty("author")
    private Integer id;

    /**
     * Время создания комментария
     * */
    private String createdAt;

    /**
     * id объявления
     */
    private Integer pk;

    /**
     * Текст комментария
     * */
    private String text;
}
