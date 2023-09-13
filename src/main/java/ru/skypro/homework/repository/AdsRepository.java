package ru.skypro.homework.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.skypro.homework.model.Ads;

import java.util.List;

@Repository
public interface AdsRepository extends CrudRepository<Ads, Integer> {
List<Ads> findAll();


Ads findAdsByPk(Integer pk);

}
