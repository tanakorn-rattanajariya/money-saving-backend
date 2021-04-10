package com.example.smsdrw.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class service {
	
	@Autowired
	public BankAccountService bank;
	@Autowired
	public AccountService account;
	@Autowired
	public CategoryService category;
	@Autowired
	public DepositService deposit;
	@Autowired
	public TransactionService transaction;
	@Autowired
	public WithdrawService withdraw;

}
