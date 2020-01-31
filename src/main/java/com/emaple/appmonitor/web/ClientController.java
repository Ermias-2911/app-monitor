package com.emaple.appmonitor.web;

import com.emaple.appmonitor.domain.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By Shameera.A on 1/31/2020
 */
@RestController
@RequestMapping("api/v1/client")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping(value = "/all")
    public ResponseEntity<?> getClientDetails(){
        return ResponseEntity.ok(clientService.getClientDetails());
    }

    @GetMapping(value = "/get-one")
    public ResponseEntity<?> getClientById(){
        return ResponseEntity.ok(clientService.getClientById());
    }
}
