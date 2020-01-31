package com.emaple.appmonitor.domain.Impl;

import com.emaple.appmonitor.domain.ClientService;
import com.emaple.appmonitor.domain.EmployeeService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Created By Shameera.A on 1/31/2020
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public String getEmployeeDetails() {
        /* add some logic */
        return "Employee One";
    }

    @Override
    public boolean isEmployeeApiUp() {
        return true;  /* implement the logic to get up down status from db*/
    }

    @Override
    public LocalDateTime getAvailableSince() {
        return LocalDateTime.now();
    }
}
