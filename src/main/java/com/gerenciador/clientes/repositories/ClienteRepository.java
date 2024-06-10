package com.gerenciador.clientes.repositories;

import com.gerenciador.clientes.models.entities.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {


    Optional<Cliente> findByCpfCnjp(String cpfCnpj);
}
