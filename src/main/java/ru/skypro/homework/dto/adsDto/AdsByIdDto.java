package ru.skypro.homework.dto.adsDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * ДТО - данные об авторе и самом объявлении
 *
 */
@Data
public class AdsByIdDto {

    /**
     * Ссылка на картинку объявления
     */
    private String image;

    /**
     * Фамилия автора объявления
     */
    @JsonProperty("authorLastName")
    private String lastName;

    /**
     * Имя автора объявления
     */
    @JsonProperty("authorFirstName")
    private String firstName;

    /**
     * Телефон автора объявления
     */
    private String phone;

    /**
     * Цена товара/услуги из объявления
     */
    private Integer price;

    /**
     * Описание объявления
     */
    private String description;

    /**
     * id объявления
     */
    private Integer pk;

    /**
     * Заголовок объявления
     */
    private String title;

    /**
     * Адрес эл.почты автора объявления
     */
    private String email;

}
