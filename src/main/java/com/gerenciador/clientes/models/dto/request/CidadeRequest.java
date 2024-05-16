package com.gerenciador.clientes.models.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CidadeRequest {

    @NotBlank(message = "O nome é obrigatório e não pode ser nulo ou apenas espaços em branco.")
    @Size(max = 32, message = "O nome deve ter no máximo 32 caracteres.")
    private String nome;
    @NotBlank(message = "O UF é obrigatório e não pode ser nulo ou apenas espaços em branco.")
    @Size(max = 2, message = "UF deve ter no máximo 2 caracteres.")
    private String uf;
    @NotBlank(message = "O código IBGE é obrigatório e não pode ser nulo ou apenas espaços em branco.")
    @Size(max = 7, message = "O código IBGE deve ter no máximo 7 caracteres.")
    private String codIBGE;
}
