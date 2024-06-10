package com.gerenciador.clientes.models.dto.request;

import com.gerenciador.clientes.models.entities.Cidade;
import com.gerenciador.clientes.utils.TipoClienteEnum;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteRequest {

    @NotBlank(message = "O nome é obrigatório e não pode estar em branco.")
    @Size(max = 100, message = "O nome deve ter no máximo 30 caracteres.")
    private String nome;

    @Pattern(regexp = "\\d{11}|\\d{14}", message = "O CPF/CNPJ deve conter 11 ou 14 dígitos.")
    private String cpfCnpj;

    @Past(message = "A data de nascimento deve ser uma data passada.")
    private LocalDate dataNascimento;

    @NotBlank(message = "O endereço é obrigatório.")
    @Size(max = 255, message = "O endereço deve ter no máximo 255 caracteres.")
    private String endereco;

    @NotNull(message = "O número do endereço é obrigatório.")
    @Min(value = 1, message = "O número do endereço deve ser maior que zero.")
    private Integer numero;

    @NotBlank(message = "O bairro é obrigatório.")
    @Size(max = 100, message = "O bairro deve ter no máximo 100 caracteres.")
    private String bairro;

    @NotBlank(message = "O CEP é obrigatório.")
    @Pattern(regexp = "\\d{8}", message = "O CEP deve conter 8 dígitos.")
    private String cep;

    @Pattern(regexp = "\\(\\d{2}\\) \\d{4,5}-\\d{4}", message = "O telefone deve seguir o formato (XX) XXXXX-XXXX.")
    private String telefone;

    @Email(message = "O e-mail deve ser válido.")
    private String email;

    private boolean ativo;

    @NotNull(message = "O tipo de cliente é obrigatório.")
    private TipoClienteEnum tipoCliente;

    @NotNull(message = "A cidade é obrigatória.")
    private Cidade cidade;
}

