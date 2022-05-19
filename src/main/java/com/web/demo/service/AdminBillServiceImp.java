package com.web.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.demo.entity.Bill;
import com.web.demo.repository.AdminBillRepo;

@Service
public class AdminBillServiceImp implements AdminBillService {
	@Autowired
	AdminBillRepo bill;
	
	@Override
	public List<Bill> findAllTop() {
		
		return bill.findAllTop();
	}

	@Override
	public long findCount(String date) {
		return bill.findCount(date);
	}

	@Override
	public String findTotalPrice(String date) {
		return bill.findTotalPrice(date);
	}
	
	
}
