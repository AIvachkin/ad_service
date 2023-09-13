package ru.skypro.homework.dto;

import lombok.Data;

/**
 * ДТО - регистрационные данные пользователя
 *
 */
@Data
public class RegisterReq {

    /**
     * Логин пользователя
     *
     */
    private String username;

    /**
     * Пароль пользователя
     *
     */
    private String password;

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
     * Роль пользователя
     *
     */
    private Role role;
}
