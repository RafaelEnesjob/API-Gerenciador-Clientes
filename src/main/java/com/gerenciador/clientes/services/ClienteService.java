package com.gerenciador.clientes.services;

import com.gerenciador.clientes.exceptions.CpfCnpjException;
import com.gerenciador.clientes.mapper.ClienteMapper;
import com.gerenciador.clientes.models.dto.request.ClienteRequest;
import com.gerenciador.clientes.models.dto.response.ClienteResponse;
import com.gerenciador.clientes.models.entities.Cliente;
import com.gerenciador.clientes.repositories.ClienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;
    private final ClienteMapper clienteMapper = ClienteMapper.INSTANCE;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }


    @Transactional
    public ClienteResponse cadastrarCliente(final ClienteRequest clienteRequest) {
        // Verificar se o CPF/CNPJ já existe
//        Optional<Cliente> cpfCnpjCliente = clienteRepository.findByCpfCnpj(clienteRequest.getCpfCnpj());
//        if (cpfCnpjCliente.isPresent()) {
//            throw new CpfCnpjException();
//        }

        Cliente cliente = clienteMapper.toClienteEntity(clienteRequest);
        Cliente clienteSalvo = clienteRepository.save(cliente);
        return clienteMapper.toClienteResponse(clienteSalvo);
    }

}
