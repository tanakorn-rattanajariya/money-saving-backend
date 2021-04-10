package com.example.smsdrw.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.smsdrw.model.Withdraw;
import com.example.smsdrw.repository.WithdrawRepository;
@Service
public class WithdrawService extends BaseService<Withdraw,Long,WithdrawRepository>{

}
