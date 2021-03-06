package com.example.smsdrw.controller;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.smsdrw.model.Account;
import com.example.smsdrw.model.BankAccount;

@RestController
@RequestMapping("/bank")
public class BankAccountController extends controller<BankAccount,Long> {

	@Override
	public ResponseEntity<?> get(@RequestParam Long id) {
		// TODO Auto-generated method stub
		log.info(id.toString());
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
		data.setAccount(service.account.get(data.getAccount_id()).orElse(null));
		return ResponseEntity.ok(service.bank.post(data));
	}

	@Override
	public ResponseEntity<?> put(@RequestBody BankAccount data,@RequestParam Long id) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.bank.put(data,id));
	}

	@Override
	public ResponseEntity<?> delete(@RequestParam Long id) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.bank.delete(id));
	}



	

}
