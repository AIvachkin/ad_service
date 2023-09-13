package ru.skypro.homework.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.skypro.homework.model.Images;
@Repository
public interface ImagesRepository extends CrudRepository<Images, Integer> {

    @Query(value = "UPDATE images SET image_link = ?2 where image_id = ?1", nativeQuery = true)
    Images update(Integer id, String image);



}
