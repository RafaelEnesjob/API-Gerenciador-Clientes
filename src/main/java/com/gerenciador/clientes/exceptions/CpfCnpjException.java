package com.gerenciador.clientes.exceptions;

public class CpfCnpjException extends RuntimeException {

    public CpfCnpjException() {
        super("CPF/CNPJ já cadastrado.");
    }

    public CpfCnpjException(String message) {
        super(message);
    }
}
