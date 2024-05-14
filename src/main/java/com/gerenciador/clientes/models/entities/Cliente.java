package com.gerenciador.clientes.models.entities;

import com.gerenciador.clientes.utils.TipoClienteEnum;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Entity
@Table(name = "tb_clientes")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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
    @ManyToOne
    @JoinColumn(name = "cidade_id")
    private Cidade cidade;
}
