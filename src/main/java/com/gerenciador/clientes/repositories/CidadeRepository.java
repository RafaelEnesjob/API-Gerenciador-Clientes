package com.gerenciador.clientes.repositories;

import com.gerenciador.clientes.models.entities.Cidade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends CrudRepository<Cidade, Long> {
}
