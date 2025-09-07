
package com.excelR.banking_system.banking.service;

import java.util.List;

import com.excelR.banking_system.banking.dto.AccountUserDTO;
import com.excelR.banking_system.banking.dto.UserAccountDTO;
import com.excelR.banking_system.banking.model.Account;

public interface AccountService {
	public Account createAccount(long userId, Account account);

	public List<AccountUserDTO> findAccountDetailsByAccountNumber(Long accountNumber);

	List<UserAccountDTO> findAccountDetailsByCustomerId(Long customerId);
	
	List<Object[]> findUserAccountDetailsByAccountNumber(Long accountNumber);

}
