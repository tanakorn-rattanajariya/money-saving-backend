package com.example.smsdrw.controller;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.smsdrw.model.BankAccount;

@RestController
@RequestMapping("/bank")
public class BankAccountController extends controller<BankAccount,UUID> {

	@Override
	public ResponseEntity<?> get(UUID id) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.bank.get(id));
	}

	@Override
	public ResponseEntity<?> list() {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.bank.list(0));
	}

	@Override
	public ResponseEntity<?> post(BankAccount data) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.bank.post(data));
	}

	@Override
	public ResponseEntity<?> put(BankAccount data, UUID id) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.bank.put(data,id));
	}

	@Override
	public ResponseEntity<?> delete(UUID id) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.bank.delete(id));
	}



	

}
