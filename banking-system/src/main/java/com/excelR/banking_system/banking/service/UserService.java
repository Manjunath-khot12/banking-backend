
package com.excelR.banking_system.banking.service;

import java.util.Optional;

import com.excelR.banking_system.banking.model.User;

public interface UserService {
  
	 public User registerUser(User user);
	 public Optional<User> authenticateUser(String  email);
	 public Optional<User> findById(long customerId);
	 public void updateUser(Long customerId, int age, String email, long phoneNumber, String address);
}
