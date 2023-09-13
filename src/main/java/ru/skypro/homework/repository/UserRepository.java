package ru.skypro.homework.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.skypro.homework.model.Users;


@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {

    @Query(value = "SELECT * from users where username = ?1", nativeQuery = true)
    Users findByEmail(String email);

}
