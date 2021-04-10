package com.example.smsdrw.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.smsdrw.model.BankAccount;
import com.example.smsdrw.repository.BankAccountRepository;

@Service
public class BankAccountService extends BaseService<BankAccount,Long,BankAccountRepository> {

}
