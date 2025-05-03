package com.example.driveremote.repositories;

import com.example.driveremote.models.Results;
import com.example.driveremote.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ResultsRepository extends JpaRepository<Results, Integer> {
    List<Results> findByUserIdOrderByTestDateDesc(Integer userId);
    Results findFirstByUserIdOrderByTestDateDesc(Integer userId);
}
