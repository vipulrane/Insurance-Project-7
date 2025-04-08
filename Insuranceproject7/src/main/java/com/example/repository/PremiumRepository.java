package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Premium;

@Repository
public interface PremiumRepository extends JpaRepository<Premium, Integer> {

}
