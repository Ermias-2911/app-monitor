package com.emaple.appmonitor.domain.Impl;

import com.emaple.appmonitor.domain.ClientService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created By Shameera.A on 1/31/2020
 */

@Service
public class ClientServiceImpl implements ClientService {

    @Override
    public String getClientDetails() {
        /* add some logic */
        return "Client One";
    }

    @Override
    public String getClientById() {
        return " Client 1 details";
    }

    @Override
    public boolean isClientApiUp() {
        return true;  /* implement the logic to get up down status from db*/
    }

    @Override
    public LocalDateTime getAvailableSince() {
        return LocalDateTime.now();
    }
}
