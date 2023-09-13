package ru.skypro.homework.model;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

/**
 * Класс - сущность объявления
 */
@Data
@Entity
public class Ads {


    /**
     * id объявления
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ad_id")
    private Integer pk;


    /**
     * Связь объявление с сущностью User
     */
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;


    /**
     * Картинка - визуализация объявления
     */
    @OneToOne
    @JoinColumn(name = "image_id")
    private Images image;

    /**
     * Описание объявления
     */
    private String description;

    /**
     *Цена товара/услуги из объявления
     */
    private Integer price;

    /**
     *Заголовок объявления
     */
    private String title;

    /**
     * Время создания объявления
     */
    private Instant createdAt;

    /**
     *Список комментариев/отзывов пользователя
     */
    @OneToMany(mappedBy = "ad", cascade = CascadeType.REMOVE)
    private List<Comments> comments;

}
