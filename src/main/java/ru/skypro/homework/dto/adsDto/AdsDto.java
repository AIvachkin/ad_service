package ru.skypro.homework.dto.adsDto;

import lombok.*;

/**
 * DTO результата создания и изменения объявления
 * */
@Data
@NoArgsConstructor
public class AdsDto {
    /**
     * id автора объявления
     * */
    private Integer author;

    /**
     * Ссылка на картинку объявления
     */
    private String image;

    /**
     * id объявления
     */
    private Integer pk;

    /**
     * Цена товара
     * */
    private Integer price;

    /**
     * Заголовок объявления
     * */
    private String title;
}
