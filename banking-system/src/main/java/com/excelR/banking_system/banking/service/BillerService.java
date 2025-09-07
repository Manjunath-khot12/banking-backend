package com.excelR.banking_system.banking.service;

import java.util.List;

import com.excelR.banking_system.banking.model.Biller;


public interface BillerService {
	 public Biller addBiller(long userId, Biller biller);
     public List<Biller> getAllBills();
     public List<Object[]> findBillDetailsByCustomerId(long customerId);
}
