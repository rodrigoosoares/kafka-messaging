package com.personal.producer.repositories;

import com.personal.producer.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPostgresRepository extends JpaRepository<User, Long> {
}
