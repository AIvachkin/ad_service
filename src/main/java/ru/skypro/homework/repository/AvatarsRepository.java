package ru.skypro.homework.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.skypro.homework.model.Avatars;


@Repository
public interface AvatarsRepository extends CrudRepository<Avatars, Integer> {
}
