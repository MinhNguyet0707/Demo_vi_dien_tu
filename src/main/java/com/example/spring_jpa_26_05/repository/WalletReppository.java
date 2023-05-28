package com.example.spring_jpa_26_05.repository;

import com.example.spring_jpa_26_05.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletReppository extends JpaRepository<Wallet,Integer> {
}
