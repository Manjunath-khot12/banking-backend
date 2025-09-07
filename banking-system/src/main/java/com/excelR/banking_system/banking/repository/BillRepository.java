package com.excelR.banking_system.banking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.excelR.banking_system.banking.model.Biller;

@Repository
public interface BillRepository extends JpaRepository<Biller, Long> {
	@Query("SELECT b.billName, b.billType, b.provider FROM Biller b WHERE b.customerId.id = :customerId")
	List<Object[]> findBillDetailsByCustomerId(long customerId);
}
