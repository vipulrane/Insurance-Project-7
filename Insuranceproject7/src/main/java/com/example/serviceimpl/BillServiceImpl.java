package com.example.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Bill;
import com.example.repository.BillRepository;
import com.example.service.BillService;

@Service
public class BillServiceImpl implements BillService {

	@Autowired
	private BillRepository billRepository;

	// save
	@Override
	public Bill saveBill(Bill bill) {
		Bill bill1 = billRepository.save(bill);
		return bill1;
	}

	// update
	@Override
	public Bill updateBill(Bill bill) {
		Bill bill1 = billRepository.save(bill);
		return bill1;
	}

	// get
	@Override
	public List<Bill> getBillById(Integer id) {
		List<Bill> listBill = billRepository.findBybId(id);
		return listBill;
		
	}

	// delete
	@Override
	public void deleteBill(Integer id) {
		billRepository.deleteById(id);

	}

}
