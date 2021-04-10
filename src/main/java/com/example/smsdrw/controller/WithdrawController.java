package com.example.smsdrw.controller;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.smsdrw.model.Withdraw;

@RestController
@RequestMapping("/withdraw")
public class WithdrawController  extends controller<Withdraw,Long> {

	@Override
	public ResponseEntity<?> get(Long id) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.withdraw.get(id));
	}

	@Override
	public ResponseEntity<?> list() {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.withdraw.list(0));
	}

	@Override
	public ResponseEntity<?> post(@RequestBody Withdraw data) {
		// TODO Auto-generated method stub
		data.setCategory(service.category.get(data.getCategory_id()).orElse(null));
		data.setBankAccount(service.bank.get(data.getBank_account_id()).orElse(null));
		return ResponseEntity.ok(service.withdraw.post(data));
	}

	@Override
	public ResponseEntity<?> put(Withdraw data, Long id) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.withdraw.put(data, id));
	}

	@Override
	public ResponseEntity<?> delete(Long id) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.withdraw.delete(id));
	}

}
