package com.gerenciador.clientes.models.entities;

import com.gerenciador.clientes.utils.TipoClienteEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    @NotBlank
    private String nome;
    @NotBlank
    private String cpfCnpj;
    @NotNull
    private LocalDate dataNascimento;
    @NotBlank
    private String endereco;
    @NotNull
    private Integer numero;
    @NotBlank
    private String bairro;
    @NotBlank
    private String cep;
    @NotBlank
    private String telefone;
    @NotBlank
    private String email;
    @NotNull
    private boolean ativo;
    @NotNull
    private TipoClienteEnum tipoCliente;
    @ManyToOne
    @JoinColumn(name = "cidade_id")
    @NotNull
    private Cidade cidade;
}
