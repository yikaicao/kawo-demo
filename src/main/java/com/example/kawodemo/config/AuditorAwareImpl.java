package com.example.kawodemo.config;

import ch.qos.logback.core.testUtil.RandomUtil;
import java.util.Optional;
import org.springframework.data.domain.AuditorAware;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of(String.valueOf(RandomUtil.getPositiveInt()));
    }
}
