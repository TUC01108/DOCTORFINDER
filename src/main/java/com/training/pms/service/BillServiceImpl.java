package com.training.pms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.training.pms.model.Bill;

@Service
public class BillServiceImpl implements BillService {

	@Override
	public List<Bill> getBills() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addBill(Bill bill) {
		// TODO Auto-generated method stub
		return "it works for bills";
	}

	@Override
	public boolean isBillExists(int billid) {
		// TODO Auto-generated method stub
		return false;
	}

}
