package ru.skypro.homework.dto;

import lombok.Data;

/**
 * ДТО - данные пользователя
 *
 */
@Data
public class UserDto {


    /**
     * id пользователя
     *
     */
    private Integer id;

    /**
     * Логин пользователя
     *
     */
    private String email;

    /**
     * Имя пользователя
     *
     */
    private String firstName;

    /**
     * Фамилия пользователя
     *
     */
    private String lastName;

    /**
     * Телефон пользователя
     *
     */
    private String phone;

    /**
     * Дата регистрации пользователя
     *
     */
    private String regDate;

    /**
     * Город проживания пользователя
     *
     */
    private String city;

    /**
     * Ссылка на аватар пользователя
     *
     */
    private String image;
}
