package com.example.smsdrw.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.smsdrw.model.Deposit;
import com.example.smsdrw.repository.DepositRepository;
@Service
public class DepositService extends BaseService<Deposit,Long,DepositRepository>{

}
