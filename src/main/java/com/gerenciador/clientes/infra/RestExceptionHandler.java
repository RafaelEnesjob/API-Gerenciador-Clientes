package com.gerenciador.clientes.infra;

import com.gerenciador.clientes.exceptions.CpfCnpjException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    private ResponseEntity<String> cpfCnpjJaCadastradoHandler(CpfCnpjException cpfCnpjException) {
        return ResponseEntity.status(HttpStatus.)
    }
}
