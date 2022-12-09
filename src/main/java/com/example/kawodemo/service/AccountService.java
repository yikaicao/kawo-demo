package com.example.kawodemo.service;

import com.example.kawodemo.model.Account;
import com.example.kawodemo.model.AccountRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(
        AccountRepository accountRepository) {this.accountRepository = accountRepository;}

    public void insertAccount(Account account) {
        accountRepository.insert(account);
    }

    public List<Account> findAll() {
        return accountRepository.findAll();
    }
}
