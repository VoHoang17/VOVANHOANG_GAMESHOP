package com.web.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.demo.entity.Bill;
import com.web.demo.entity.Users;
import com.web.demo.repository.AdminBillRepo;

@Service
public class BillServiceImp  implements BillService{

@Override
public Optional<Bill> findById(Integer id) {
		return billrepo.findById(id);
	}

@Override
public List<Bill> findAll() {
		return billrepo.findAll();
	}

@Override
public <S extends Bill> Bill save(S entity,Users us,double price) {
	entity.setDate(new Date());
	entity.setUsers(us);
	entity.setTotalPrice((long)price);
	Bill bill=billrepo.save(entity);
		return bill;
	}

@Autowired
AdminBillRepo billrepo;

}
