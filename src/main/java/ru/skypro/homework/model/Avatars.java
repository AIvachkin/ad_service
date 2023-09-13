package ru.skypro.homework.model;


import lombok.Data;

import javax.persistence.*;

/**
 * Класс - сущность аватар пользователя
 */
@Data
@Entity
public class Avatars {

    /**
     * id аватара
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="avatar_id")
    private Integer id;

    /**
     * Ссылка на картинку (аватар пользователя)
     */
    @Column(name="avatar_link")
    private String avatar;

    @OneToOne
    @JoinColumn(name = "user_id")
    private Users user;

    /**
     * Ссылка на контроллер для получения аватарок для фронта
     */
    @Column(name="link_for_front")
    private String linkForFront;


    /**
     * Ссылка на контроллер для получения размера аватарок для фронта
     */
    @Column(name="file_size")
    private Long fileSize;

    /**
     * Ссылка на контроллер для получения типа файла аватарки для фронта
     */
    @Column(name="media_type")
    private String mediaType;
}
