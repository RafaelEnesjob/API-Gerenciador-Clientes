package com.gerenciador.clientes.models.dto.response;

import com.gerenciador.clientes.models.entities.Cidade;
import com.gerenciador.clientes.utils.TipoClienteEnum;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteResponse {

    private String nome;

    private String cpfCnpj;

    private LocalDate dataNascimento;

    private String endereco;

    private Integer numero;

    private String bairro;

    private String cep;

    private String telefone;

    private String email;

    private boolean ativo;

    private TipoClienteEnum tipoCliente;

    private Cidade cidade;


}
