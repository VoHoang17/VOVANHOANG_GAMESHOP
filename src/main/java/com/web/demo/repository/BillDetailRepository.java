package com.web.demo.repository;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.demo.entity.Bill;
import com.web.demo.entity.BillDetail;

@Repository
public interface BillDetailRepository extends JpaRepository<BillDetail, Integer>{

	List<BillDetail> findByBill(Bill bill);
}
