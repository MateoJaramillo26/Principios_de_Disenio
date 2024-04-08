package com.pokemon.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Cache;

import java.util.Set;

@Getter
@Setter
@ToString
@Entity
@Cache(region = "pokemonCache", usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "Pokemon")
public class Pokemon {
    @Id
    private long national_number;
    private String name;
    private float height;
    private float weight;
}
