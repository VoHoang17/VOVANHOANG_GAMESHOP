package com.web.demo.service;
import java.util.List;
import java.util.Optional;


import com.web.demo.entity.Bill;
import com.web.demo.entity.Users;

public interface BillService {

	<S extends Bill> Bill save(S entity, Users us, double price);

	List<Bill> findAll();

	Optional<Bill> findById(Integer id);



}
