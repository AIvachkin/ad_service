package ru.skypro.homework.dto.adsDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * ДТО - список объявлений
 *
 */
@Data
@Builder
public class AdsAllDto {

    /**
     * Поле - счетчик объявлений
     */
    private Integer count;

    /**
     * Поле - список всех объявлений
     */
    @JsonProperty("results")
    private List<AdsDto> allResults;

}
