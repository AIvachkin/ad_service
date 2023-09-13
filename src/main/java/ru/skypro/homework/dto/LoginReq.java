package ru.skypro.homework.dto;

import lombok.Data;

/**
 * ДТО - входящий запрос (логин и пароль пользователя)
 *
 */
@Data
public class LoginReq {

    /**
     * Пароль пользователя
     */
    private String password;

    /**
     * Логин пользователя
     */
    private String username;

}
