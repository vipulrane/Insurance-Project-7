package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill, Integer> {

	public List<Bill> findBybId(Integer id);

}
