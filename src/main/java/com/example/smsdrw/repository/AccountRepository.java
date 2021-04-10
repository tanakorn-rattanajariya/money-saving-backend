package com.example.smsdrw.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.smsdrw.model.Account;

@Repository
public interface AccountRepository  extends JpaRepository<Account,Long> {

}
