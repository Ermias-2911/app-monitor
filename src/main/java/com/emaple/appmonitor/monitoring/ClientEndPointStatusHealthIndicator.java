package com.emaple.appmonitor.monitoring;

import com.emaple.appmonitor.domain.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created By Shameera.A on 1/31/2020
 */
@Component
public class ClientEndPointStatusHealthIndicator implements HealthIndicator {

    @Autowired
    private ClientService clientService;

    @Override
    public Health health() {
        try {
            Health.Builder healthBuilder;
            healthBuilder = clientService.isClientApiUp() ? Health.up() : Health.down();
            String pattern = "yyyy-M-dd hh:mm:ss";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            LocalDateTime availableSince = clientService.getAvailableSince();
            return healthBuilder.withDetail("up since", simpleDateFormat.format(new Date())).build();
        } catch (Exception e) {
            return Health.down(e).build();
        }
    }
}
