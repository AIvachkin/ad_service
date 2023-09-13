package ru.skypro.homework.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.Collection;

/**
 * Класс - сущность пользователь
 */
@Data
@Entity
public class Users {

    /**
     * id пользователя/автора объявления
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Integer id;

    /**
     * Адрес электронной почты автора объявления
     */
    @Column(name="username")
    private String email;

    /**
     * Пароль пользователя
     */
    private String password;

    /**
     * Имя автора объявления/комментария
     */
    private String firstName;

    /**
     * Фамилия автора объявления/комментария
     */
    private String lastName;

    /**
     * Телефон пользователя
     */
    private String phone;

    /**
     * Дата регистрации пользователя
     */
    @JsonIgnore
    private Instant regDate;

    /**
     * Город проживания пользователя
     */
    private String city;

    /**
     * Аватар пользователя
     */
    @OneToOne
    @JoinColumn(name = "avatar_id")
    private Avatars avatar;

    /**
     * Объявления пользователя
     */
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    @ToString.Exclude
    private Collection<Ads> ads;

    /**
     * Комментарии пользователя
     */
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private Collection<Comments> comments;

}
