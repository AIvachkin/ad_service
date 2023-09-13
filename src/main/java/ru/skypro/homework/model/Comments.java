package ru.skypro.homework.model;


import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

/**
 * Класс - сущность комментарий к объявлению
 */
@Data
@Entity
public class Comments {


    /**
     * id комментария
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="comment_id")
    private Integer pk;

    /**
     * Время создания комментария
     */
    private Instant createdAt;

    /**
     * Комментарий пользователя/отзыв
     */
    @Column(name="comment_text")
    private String text;

    /**
     * id пользователя
     */
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    /**
     * id объявления
     */
    @ManyToOne
    @JoinColumn(name = "ad_id")
    private Ads ad;

}
