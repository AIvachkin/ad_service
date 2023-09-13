package ru.skypro.homework.dto;

import lombok.Data;

/**
 * ДТО - запрос на смену пароля
 *
 */
@Data
public class PasswordDto {

    /**
     * Текущий пароль пользователя
     *
     */
    private String currentPassword;

    /**
     * Новый пароль пользователя
     *
     */
    private String newPassword;
}
