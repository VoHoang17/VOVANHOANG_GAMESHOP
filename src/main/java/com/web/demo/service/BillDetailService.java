package com.web.demo.service;
import java.util.List;


import com.web.demo.entity.Bill;
import com.web.demo.entity.BillDetail;
import com.web.demo.entity.Games;

public interface BillDetailService {

	<S extends BillDetail> S save(S entity);

	<S extends BillDetail> BillDetail addbilldetail(Bill bill, Games game);

	List<BillDetail> findByBill(Bill bill);

	

}
