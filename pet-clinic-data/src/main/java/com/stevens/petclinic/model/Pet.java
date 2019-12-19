package com.stevens.petclinic.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
  private PetType petType;
  private Owner owner;
  private LocalDate birthDate;
}