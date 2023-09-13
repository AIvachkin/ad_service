package ru.skypro.homework.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.skypro.homework.model.Comments;
@Repository
public interface CommentsRepository extends CrudRepository<Comments, Integer> {


    Comments findByPk(Integer id);
    Comments findByAd_PkAndPk(Integer adPk, Integer id);


}
