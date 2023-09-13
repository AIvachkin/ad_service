package ru.skypro.homework;

import org.springframework.security.core.GrantedAuthority;

/**
 * Перечисление: роли пользователей
 *
 */
public enum Role implements GrantedAuthority {
    USER, ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}

