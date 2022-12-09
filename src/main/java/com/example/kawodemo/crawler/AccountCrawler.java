package com.example.kawodemo.crawler;

import com.example.kawodemo.config.BilibiliProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service public class AccountCrawler {

    private final BilibiliProperties bilibiliProperties;

    public AccountCrawler(
        BilibiliProperties bilibiliProperties) {this.bilibiliProperties = bilibiliProperties;}

    @Scheduled(cron = "0 0 * * * *")
    public void getUserStats() {
        log.info("clientId=" + bilibiliProperties.getClientId());
    }

}
