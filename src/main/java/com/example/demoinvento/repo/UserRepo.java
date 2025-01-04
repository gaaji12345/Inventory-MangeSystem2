package com.example.demoinvento.repo;/*  gaajiCode
    99
    03/01/2025
    */


import com.example.demoinvento.enitity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);
}
