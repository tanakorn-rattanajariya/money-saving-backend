package com.example.smsdrw.repository;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.smsdrw.model.Transaction;
import com.example.smsdrw.model.Withdraw;

import response.transaction.TransactionCustom;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	@Query(value = "select 'expense' as type , * , 0 as clazz_ from withdraw where to_date(cast(date as TEXT),'yyyy-MM-dd') = ?1  union select 'income' as type , * , 0 as clazz_ from deposit where to_date(cast(date as TEXT),'yyyy-MM-dd') = ?1", nativeQuery = true)
	public List<Transaction> findByDateEqualMonthAndYearOrDate(Date date);
	@Query(value = "select 'expense' as type , * , 0 as clazz_ from withdraw where to_date(cast(date as TEXT),'yyyy-MM') = ?1  union select 'income' as type , * , 0 as clazz_ from deposit where to_date(cast(date as TEXT),'yyyy-MM') = ?1", nativeQuery = true)
	public List<Transaction> findByDateEqualMonthAndYear(Date month);
	
	
}
