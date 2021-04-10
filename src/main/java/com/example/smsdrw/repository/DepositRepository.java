package com.example.smsdrw.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.smsdrw.model.Deposit;

@Repository
public interface DepositRepository extends JpaRepository<Deposit,Long> {

}
