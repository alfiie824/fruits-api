package org.acme;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

@Entity
@Cacheable
public class Fruit extends PanacheEntity {

    @Column(length = 40, unique = true)
    public String name;

}
