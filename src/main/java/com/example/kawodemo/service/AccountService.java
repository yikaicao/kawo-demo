package com.example.kawodemo.service;

import com.example.kawodemo.model.Account;
import com.example.kawodemo.model.AccountRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(
        AccountRepository accountRepository) {this.accountRepository = accountRepository;}

    public Account insertAccount(Account account) {
        return accountRepository.insert(account);
    }

    public Page<Account> find(Pageable pageable) {
        return accountRepository.findAll(pageable);
    }
}
