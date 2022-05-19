package com.web.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.demo.entity.Discount;
import com.web.demo.repository.DiscountRepository;

@Service
public class DiscountServiceImp implements DiscountService{
	
	@Autowired
	DiscountRepository discountRepository;

	@Override
	public List<Discount> findAll() {
		return discountRepository.findAll();
	}

	@Override
	public <S extends Discount> S save(S entity) {
		return discountRepository.save(entity);
	}

	@Override
	public Discount getById(Integer id) {
		return discountRepository.getById(id);
	}	
}
