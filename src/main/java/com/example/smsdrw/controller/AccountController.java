package com.example.smsdrw.controller;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.smsdrw.model.Account;

@RestController
@RequestMapping("/account")
public class AccountController extends controller<Account,Long> {

	@Override
	public ResponseEntity<?> get(@RequestParam Long id) {
		// TODO Auto-generated method stub
		
		return ResponseEntity.ok(service.account.get(id));
	}

	@Override
	public ResponseEntity<?> list() {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.account.list(0));
	}

	@Override
	public ResponseEntity<?> post(@RequestBody Account data) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.account.post(data));
	}

	@Override
	public ResponseEntity<?> put(@RequestBody Account data, Long id) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.account.put(data, id));
	}

	@Override
	public ResponseEntity<?> delete(@RequestParam Long id) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.account.delete(id));
	}

}
