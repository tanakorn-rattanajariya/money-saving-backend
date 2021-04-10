package com.example.smsdrw.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.smsdrw.model.Account;
import com.example.smsdrw.repository.AccountRepository;

@Service
public class AccountService extends BaseService<Account,Long,AccountRepository>{

}
