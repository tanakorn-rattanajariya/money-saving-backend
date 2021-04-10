package com.example.smsdrw.controller;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.smsdrw.model.Deposit;

@RestController
@RequestMapping("/deposit")
public class DepositController extends controller<Deposit,Long> {

	@Override
	public ResponseEntity<?> get(Long id) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.deposit.get(id));
	}

	@Override
	public ResponseEntity<?> list() {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.deposit.list(0));
	}

	@Override
	public ResponseEntity<?> post(@RequestBody Deposit data) {
		// TODO Auto-generated method stub
		data.setCategory(service.category.get(data.getCategory_id()).orElse(null));
		data.setBankAccount(service.bank.get(data.getBank_account_id()).orElse(null));
		return ResponseEntity.ok(service.deposit.post(data));
	}

	@Override
	public ResponseEntity<?> put(Deposit data, Long id) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.deposit.put(data, id));
	}

	@Override
	public ResponseEntity<?> delete(Long id) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.deposit.delete(id));
	}

}
