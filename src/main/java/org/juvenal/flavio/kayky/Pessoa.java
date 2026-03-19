package org.juvenal.flavio.kayky;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import org.hibernate.dialect.function.DB2SubstringFunction;

@Entity
public class Pessoa extends PanacheEntity {
    public String nome;
    public String dataNascimento;
}
