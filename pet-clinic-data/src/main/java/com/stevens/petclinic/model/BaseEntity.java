package com.stevens.petclinic.model;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

public class BaseEntity implements Serializable{
  private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
