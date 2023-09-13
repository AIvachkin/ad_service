package ru.skypro.homework.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * Класс - сущность изображение (аватар или картинка к объявлению)
 */
@Data
@Entity
public class Images {

    /**
     * id изображения
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="image_id")
    private Integer id;

    /**
     * Ссылка на картинку (аватар пользователя или визуализация объявления)
     */
    @Column(name="image_link")
    private String image;

    /**
     * Ссылка на картинку (аватар пользователя или визуализация объявления)
     */
    @OneToOne(mappedBy = "image")
    @ToString.Exclude
    private Ads ads;

    /**
     * Ссылка на контроллер для получения картинок для фронта
     */
    @Column(name="link_for_front")
    private String linkForFront;

    /**
     * Ссылка на контроллер для получения размера картинок для фронта
     */
    @Column(name="file_size")
    private Long fileSize;

    /**
     * Ссылка на контроллер для получения типа файла картинки для фронта
     */
    @Column(name="media_type")
    private String mediaType;


}
