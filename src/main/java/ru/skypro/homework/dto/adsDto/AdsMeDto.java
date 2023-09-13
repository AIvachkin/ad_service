package ru.skypro.homework.dto.adsDto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Builder;

import java.util.List;

/**
 * ДТО - список всех объявлений пользователя
 *
 */
@Data
@Builder
public class AdsMeDto {

    /**
     * id автора объявления
     * */
    private Integer author;

    /**
     * Список всех объявлений
     */
    @JsonProperty("results")
    private List<AdsDto> allResults;
}
