package com.example.spring_jpa_26_05.repository;

import com.example.spring_jpa_26_05.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository  extends  JpaRepository<Account,Integer> {
}
