package com.example.tp_springboot.repositories;

import com.example.tp_springboot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
