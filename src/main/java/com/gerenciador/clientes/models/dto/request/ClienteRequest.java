package com.gerenciador.clientes.models.dto.request;

import com.gerenciador.clientes.models.entities.Cidade;
import com.gerenciador.clientes.utils.TipoClienteEnum;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

//@Getter
//@Setter
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
public class ClienteRequest {

//    @NotBlank(message = "O nome é obrigatório e não pode estar em branco.")
//    @Size(max = 100, message = "O nome deve ter no máximo 30 caracteres.")
    private String nome;

//    @NotBlank(message = "O CPF/CNPJ é obrigatório.")
//    @Pattern(regexp = "\\d{11}|\\d{14}", message = "O CPF/CNPJ deve conter 11 ou 14 dígitos.")
//    private String cpfCnpj;
//
//    @Past(message = "A data de nascimento deve ser uma data passada.")
//    private LocalDate dataNascimento;
//
//    @NotBlank(message = "O endereço é obrigatório.")
//    @Size(max = 255, message = "O endereço deve ter no máximo 255 caracteres.")
//    private String endereco;
//
//    @NotNull(message = "O número do endereço é obrigatório.")
//    @Min(value = 1, message = "O número do endereço deve ser maior que zero.")
//    private Integer numero;
//
//    @NotBlank(message = "O bairro é obrigatório.")
//    @Size(max = 100, message = "O bairro deve ter no máximo 100 caracteres.")
//    private String bairro;
//
//    @NotBlank(message = "O CEP é obrigatório.")
//    @Pattern(regexp = "\\d{8}", message = "O CEP deve conter 8 dígitos.")
//    private String cep;
//
//    @Pattern(regexp = "\\(\\d{2}\\) \\d{4,5}-\\d{4}", message = "O telefone deve seguir o formato (XX) XXXXX-XXXX.")
//    private String telefone;
//
//    @Email(message = "O e-mail deve ser válido.")
//    private String email;
//
//    private boolean ativo;
//
//    @NotNull(message = "O tipo de cliente é obrigatório.")
//    private TipoClienteEnum tipoCliente;
//
//    @NotNull(message = "A cidade é obrigatória.")
//    private Cidade cidade;

    public ClienteRequest(String nome) {
        this.nome = nome;
//        this.cpfCnpj = cpfCnpj;
//        this.dataNascimento = dataNascimento;
//        this.endereco = endereco;
//        this.numero = numero;
//        this.bairro = bairro;
//        this.cep = cep;
//        this.telefone = telefone;
//        this.email = email;
//        this.ativo = ativo;
//        this.tipoCliente = tipoCliente;
//        this.cidade = cidade;
    }

    public @NotBlank(message = "O nome é obrigatório e não pode estar em branco.") @Size(max = 100, message = "O nome deve ter no máximo 30 caracteres.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório e não pode estar em branco.") @Size(max = 100, message = "O nome deve ter no máximo 30 caracteres.") String nome) {
        this.nome = nome;
    }

//    public @NotBlank(message = "O CPF/CNPJ é obrigatório.") @Pattern(regexp = "\\d{11}|\\d{14}", message = "O CPF/CNPJ deve conter 11 ou 14 dígitos.") String getCpfCnpj() {
//        return cpfCnpj;
//    }
//
//    public void setCpfCnpj(@NotBlank(message = "O CPF/CNPJ é obrigatório.") @Pattern(regexp = "\\d{11}|\\d{14}", message = "O CPF/CNPJ deve conter 11 ou 14 dígitos.") String cpfCnpj) {
//        this.cpfCnpj = cpfCnpj;
//    }
//
//    public @Past(message = "A data de nascimento deve ser uma data passada.") LocalDate getDataNascimento() {
//        return dataNascimento;
//    }
//
//    public void setDataNascimento(@Past(message = "A data de nascimento deve ser uma data passada.") LocalDate dataNascimento) {
//        this.dataNascimento = dataNascimento;
//    }
//
//    public @NotBlank(message = "O endereço é obrigatório.") @Size(max = 255, message = "O endereço deve ter no máximo 255 caracteres.") String getEndereco() {
//        return endereco;
//    }
//
//    public void setEndereco(@NotBlank(message = "O endereço é obrigatório.") @Size(max = 255, message = "O endereço deve ter no máximo 255 caracteres.") String endereco) {
//        this.endereco = endereco;
//    }
//
//    public @NotNull(message = "O número do endereço é obrigatório.") @Min(value = 1, message = "O número do endereço deve ser maior que zero.") Integer getNumero() {
//        return numero;
//    }
//
//    public void setNumero(@NotNull(message = "O número do endereço é obrigatório.") @Min(value = 1, message = "O número do endereço deve ser maior que zero.") Integer numero) {
//        this.numero = numero;
//    }
//
//    public @NotBlank(message = "O bairro é obrigatório.") @Size(max = 100, message = "O bairro deve ter no máximo 100 caracteres.") String getBairro() {
//        return bairro;
//    }
//
//    public void setBairro(@NotBlank(message = "O bairro é obrigatório.") @Size(max = 100, message = "O bairro deve ter no máximo 100 caracteres.") String bairro) {
//        this.bairro = bairro;
//    }
//
//    public @NotBlank(message = "O CEP é obrigatório.") @Pattern(regexp = "\\d{8}", message = "O CEP deve conter 8 dígitos.") String getCep() {
//        return cep;
//    }
//
//    public void setCep(@NotBlank(message = "O CEP é obrigatório.") @Pattern(regexp = "\\d{8}", message = "O CEP deve conter 8 dígitos.") String cep) {
//        this.cep = cep;
//    }
//
//    public @Pattern(regexp = "\\(\\d{2}\\) \\d{4,5}-\\d{4}", message = "O telefone deve seguir o formato (XX) XXXXX-XXXX.") String getTelefone() {
//        return telefone;
//    }
//
//    public void setTelefone(@Pattern(regexp = "\\(\\d{2}\\) \\d{4,5}-\\d{4}", message = "O telefone deve seguir o formato (XX) XXXXX-XXXX.") String telefone) {
//        this.telefone = telefone;
//    }
//
//    public @Email(message = "O e-mail deve ser válido.") String getEmail() {
//        return email;
//    }
//
//    public void setEmail(@Email(message = "O e-mail deve ser válido.") String email) {
//        this.email = email;
//    }
//
//    public boolean isAtivo() {
//        return ativo;
//    }
//
//    public void setAtivo(boolean ativo) {
//        this.ativo = ativo;
//    }
//
//    public @NotNull(message = "O tipo de cliente é obrigatório.") TipoClienteEnum getTipoCliente() {
//        return tipoCliente;
//    }
//
//    public void setTipoCliente(@NotNull(message = "O tipo de cliente é obrigatório.") TipoClienteEnum tipoCliente) {
//        this.tipoCliente = tipoCliente;
//    }
//
//    public @NotNull(message = "A cidade é obrigatória.") Cidade getCidade() {
//        return cidade;
//    }
//
//    public void setCidade(@NotNull(message = "A cidade é obrigatória.") Cidade cidade) {
//        this.cidade = cidade;
//    }
}

