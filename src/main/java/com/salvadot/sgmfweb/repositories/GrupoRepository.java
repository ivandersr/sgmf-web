package com.salvadot.sgmfweb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.salvadot.sgmfweb.domain.Grupo;

public interface GrupoRepository extends MongoRepository<Grupo, String> {
}
