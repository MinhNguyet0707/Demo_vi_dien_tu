package com.example.spring_jpa_26_05.controller;

import com.example.spring_jpa_26_05.entity.Account;
import com.example.spring_jpa_26_05.entity.Wallet;
import com.example.spring_jpa_26_05.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AccontController {
    @Autowired
    private AccountRepository accountRepository;
    @GetMapping("/account")
    public List<Account> getAllAccount(){
            return  accountRepository.findAll();
    }
    @GetMapping("/account/{id}")
    public Optional<Account> getAccountById(@PathVariable(value = "id") int accountId){
        return accountRepository.findById(accountId);
    }
    @PutMapping("/update/{id}/balance")
    public ResponseEntity<?> updateAccount(
            @PathVariable(name = "id") int accountId,
            @RequestParam(name = "balance" )double balance) {
         Account account=  accountRepository.findById(accountId).orElse(null);
         if(account==null){
             return ResponseEntity.ok("không tồn tại id");
         }
         account.getWallet().setBalance(balance+"");
         accountRepository.save(account);
         return ResponseEntity.ok("tc");

    }
}
