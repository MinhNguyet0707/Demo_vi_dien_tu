package com.example.spring_jpa_26_05.controller;

import com.example.spring_jpa_26_05.entity.Wallet;
import com.example.spring_jpa_26_05.repository.WalletReppository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class WalletController {
    @Autowired
    private WalletReppository walletReppository;
    @GetMapping("/wallet")
    public List<Wallet> getAllWallet(){
        return  walletReppository.findAll();
    }
    @GetMapping("/wallet/{balance}")
    Optional<Wallet> getByIdBalance(@PathVariable(value = "balance") int balance){
        return walletReppository.findById(balance);
    }


}
