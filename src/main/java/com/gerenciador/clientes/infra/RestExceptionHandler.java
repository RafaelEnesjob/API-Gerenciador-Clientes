package com.gerenciador.clientes.infra;

import com.gerenciador.clientes.exceptions.CpfCnpjException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CpfCnpjException.class)
    private ResponseEntity<RestErrorMessage> cpfCnpjJaCadastradoHandler(CpfCnpjException cpfCnpjException) {
        RestErrorMessage errorMessage = new RestErrorMessage(HttpStatus.CONFLICT, cpfCnpjException.getMessage());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(errorMessage);
    }
}
