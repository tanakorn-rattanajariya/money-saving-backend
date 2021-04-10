package com.example.smsdrw.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.smsdrw.model.Transaction;

import request.transaction.FilterByDate;

@RestController
@RequestMapping("/transaction")
public class TransactionController extends controller<Transaction, Long> {

	@Override
	public ResponseEntity<?> get(Long id) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.transaction.get(id));
	}

	@Override
	public ResponseEntity<?> list() {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.transaction.list(0));
	}

	@GetMapping("/filter")
	public ResponseEntity<?> filter(@RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM") Date month) {
		// TODO Auto-generated method stub
		List<Transaction> transactions = service.transaction.findByDateEqualMonthAndYearOrDate(null, month);
		return ResponseEntity.ok(transactions);
	}

	@GetMapping("/filter/day")
	public ResponseEntity<?> filterByDay(
			@RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
		// TODO Auto-generated method stub
		List<Transaction> transactions = service.transaction.findByDateEqualMonthAndYearOrDate(date, null);
		return ResponseEntity.ok(transactions);
	}

	@Override
	public ResponseEntity<?> post(Transaction data) {
		// TODO Auto-generated method stub
		data.setCategory(service.category.get(data.getCategory_id()).orElse(null));
		data.setBankAccount(service.bank.get(data.getBank_account_id()).orElse(null));
		return ResponseEntity.ok(service.transaction.post(data));
	}

	@Override
	public ResponseEntity<?> put(Transaction data, Long id) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.transaction.put(data, id));
	}

	@Override
	public ResponseEntity<?> delete(Long id) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.transaction.delete(id));
	}

}
