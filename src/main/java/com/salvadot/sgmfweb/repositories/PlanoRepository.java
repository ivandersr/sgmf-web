package com.salvadot.sgmfweb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.salvadot.sgmfweb.domain.Plano;

public interface PlanoRepository extends MongoRepository<Plano, String> {
}
