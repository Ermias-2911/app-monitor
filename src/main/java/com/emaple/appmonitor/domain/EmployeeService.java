package com.emaple.appmonitor.domain;

import java.time.LocalDateTime;

/**
 * Created By Shameera.A on 1/31/2020
 */
public interface EmployeeService {

    String getEmployeeDetails();

    boolean isEmployeeApiUp();

    LocalDateTime getAvailableSince();
}
