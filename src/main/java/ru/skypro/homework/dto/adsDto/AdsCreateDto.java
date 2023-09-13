package ru.skypro.homework.dto.adsDto;

import com.sun.istack.NotNull;
import lombok.*;

/**
 * DTO для создания и изменения объявления
 * */
@Data
@NoArgsConstructor
public class AdsCreateDto {
    /**
     * Описание объявления
     * */
    @NotNull
    private String description;

    /**
     * Цена товара
     * */
    @NotNull
    private Integer price;

    /**
     * Заголовок объявления
     * */
    @NotNull
    private String title;

    /**
     * id автора объявления
     * */
    private Integer author;
}
