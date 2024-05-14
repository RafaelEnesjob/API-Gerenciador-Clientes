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
    private String sobreNome;
    private Integer idade;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;
    private String documento;
    private TipoClienteEnum tipoClienteEnum;
    @ManyToOne
    @JoinColumn(name = "cidade_id")
    private Cidade cidade;


}
