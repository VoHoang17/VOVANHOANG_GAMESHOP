package com.web.demo.service;

import java.util.List;

import com.web.demo.entity.Discount;

public interface DiscountService {

	List<Discount> findAll();

	<S extends Discount> S save(S entity);

	Discount getById(Integer id);

}
