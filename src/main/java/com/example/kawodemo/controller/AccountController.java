package com.example.kawodemo.controller;

import com.example.kawodemo.model.Account;
import com.example.kawodemo.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class AccountController {

    private final AccountService accountService;

    public AccountController(
        AccountService accountService) {this.accountService = accountService;}

    @PostMapping("/account")
    public void insertAccount(@RequestBody Account account) {
        log.info("post account received, account={}", account);
        accountService.insertAccount(account);
        log.info("posted account");
    }

    @GetMapping("/account")
    public void getAllAccount() {
        log.info("all account={}", accountService.findAll());
    }

}
