package com.gerenciador.clientes.mapper;

import com.gerenciador.clientes.models.dto.request.ClienteRequest;
import com.gerenciador.clientes.models.dto.response.ClienteResponse;
import com.gerenciador.clientes.models.entities.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClienteMapper {

    ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);

    // Mapeamento de ClienteRequest para a entidade cliente
    Cliente toClienteEntity (ClienteRequest clienteRequest);

    // Mapeamento de ClientEntity para ClienteResponse
    ClienteResponse toClienteResponse (Cliente cliente);




}
