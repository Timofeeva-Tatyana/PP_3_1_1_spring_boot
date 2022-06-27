package ru.javamentor.pp_3_1_1_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.javamentor.pp_3_1_1_spring_boot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
