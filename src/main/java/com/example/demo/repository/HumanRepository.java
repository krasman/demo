package com.example.demo.repository;

import com.example.demo.entity.Human;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HumanRepository extends JpaRepository<Human, Long> {
    List<Human> findByName(String name);
}
