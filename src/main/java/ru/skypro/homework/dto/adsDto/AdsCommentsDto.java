package ru.skypro.homework.dto.adsDto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import ru.skypro.homework.dto.CommentDto;

import java.util.List;

/**
 * ДТО - список объявлений, содержащий в т.ч. и их количество
 *
 */
@Data
@Builder
public class AdsCommentsDto {


    /**
     * Счетчик комментариев
     */
    private Integer count;

    /**
     * Массив размещенных объявлений
     */
    @JsonProperty("results")
    private List<CommentDto> allResults;

}
