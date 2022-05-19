package com.web.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.demo.entity.Discount;

@Repository
public interface DiscountRepository extends JpaRepository<Discount,Integer> {
}
