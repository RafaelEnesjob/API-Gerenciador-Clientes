package com.gerenciador.clientes.controllers;

import com.gerenciador.clientes.models.dto.request.ClienteRequest;
import com.gerenciador.clientes.models.dto.request.ClienteRequest2;
import com.gerenciador.clientes.models.dto.response.ClienteResponse;
import com.gerenciador.clientes.services.ClienteService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

//    private final ClienteService clienteService;
//
//    public ClienteController(ClienteService clienteService) {
//        this.clienteService = clienteService;
//    }

    @PostMapping
    public String criarCliente(@RequestBody ClienteRequest2 clienteRequest) {
//        ClienteResponse clienteResponse = clienteService.cadastrarCliente(clienteRequest);
//        return new ResponseEntity<>(clienteResponse, HttpStatus.CREATED);
        return "oi";
    }

    @GetMapping
    public String teste() {
        return "oi 2";
    }
}
