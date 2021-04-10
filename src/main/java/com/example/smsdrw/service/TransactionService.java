package com.example.smsdrw.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.smsdrw.model.Transaction;
import com.example.smsdrw.repository.TransactionRepository;

import utils.Nullable;

@Service
public class TransactionService extends BaseService<Transaction, Long, TransactionRepository> {

	public List<Transaction> findByDateEqualMonthAndYearOrDate(Date date,Date month)
			throws NullPointerException {
		return date == null ? repository.findByDateEqualMonthAndYear(month) : repository.findByDateEqualMonthAndYearOrDate(date);
	}
}
