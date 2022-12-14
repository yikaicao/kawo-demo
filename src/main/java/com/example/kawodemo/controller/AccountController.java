package com.example.kawodemo.controller;

import com.example.kawodemo.model.Account;
import com.example.kawodemo.service.AccountService;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
@Validated
public class AccountController {

    private final AccountService accountService;

    public AccountController(
        AccountService accountService) {this.accountService = accountService;}

    @PostMapping("/account")
    public Account insertAccount(@RequestBody Account account) {
        return accountService.insertAccount(account);
    }

    @GetMapping("/account")
    public Page<Account> getAllAccount(@RequestParam @Min(1) Integer page,
                                       @RequestParam @Min(1) @Max(100) Integer size) {
        return accountService.find(PageRequest.of(page, size));
    }

}
