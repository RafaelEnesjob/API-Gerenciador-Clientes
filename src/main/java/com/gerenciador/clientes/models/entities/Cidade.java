package com.gerenciador.clientes.models.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_cidades")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String uf;
    private String codIBGE;
}
