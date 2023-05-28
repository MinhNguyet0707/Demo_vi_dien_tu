package com.example.spring_jpa_26_05;

import com.example.spring_jpa_26_05.entity.Account;
import com.example.spring_jpa_26_05.entity.Wallet;
import com.example.spring_jpa_26_05.repository.AccountRepository;
import com.example.spring_jpa_26_05.repository.WalletReppository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpa2605Application implements CommandLineRunner {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private WalletReppository walletReppository;

    public static void main(String[] args) {
        SpringApplication.run(SpringJpa2605Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Wallet wallet2 = new Wallet(2,"3577675");
        Wallet wallet3 = new Wallet(3,"4000");
        Wallet wallet4 = new Wallet(4,"4000");
        Wallet wallet5 = new Wallet(5,"4000");
        Wallet wallet6 = new Wallet(6,"4000");
        walletReppository.save(wallet2);
        walletReppository.save(wallet3);
        walletReppository.save(wallet4);
        walletReppository.save(wallet5);
        walletReppository.save(wallet6);
        Account account= new Account(1,"ngue","32131",wallet2);
        Account account2= new Account(2,"ngue","32131",wallet3);
        Account account3= new Account(3,"ngue","32131",wallet4);
        Account account4= new Account(4,"ngue","32131",wallet5);
        Account account5= new Account(5,"ngue","32131",wallet6);
        accountRepository.save(account);
        accountRepository.save(account2);
        accountRepository.save(account3);
        accountRepository.save(account4);
    }
}
