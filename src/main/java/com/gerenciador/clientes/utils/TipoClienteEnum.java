package com.gerenciador.clientes.utils;

public enum TipoClienteEnum {
    FISICO("Pessoa Física"),
    JURIDICO("Pessoa Jurídica");

    private final String descricao;


    TipoClienteEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
