package com.example.service;

import java.util.List;

import com.example.entity.Bill;

public interface BillService {
	
	//save
	public Bill saveBill(Bill bill);
	
	//update Bill
	public Bill updateBill(Bill bill);
	
	//get Bill
	public List<Bill> getBillById(Integer id);
	
	//delete Bill
	public void deleteBill(Integer id);

}
