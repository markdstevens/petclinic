package com.stevens.petclinic.services;

import java.util.Set;
import com.stevens.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
  Owner findByLastName(String lastName);
}
