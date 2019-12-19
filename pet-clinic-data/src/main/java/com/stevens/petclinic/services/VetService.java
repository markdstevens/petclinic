package com.stevens.petclinic.services;

import java.util.Set;
import com.stevens.petclinic.model.Vet;

public interface VetService {
  Vet findById(Long id);

  Vet save(Vet pet);

  Set<Vet> findAll();
}