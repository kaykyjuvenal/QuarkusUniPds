package org.juvenal.flavio.kayky;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import org.hibernate.dialect.function.DB2SubstringFunction;

import java.util.List;

@Entity
public class Pessoa extends PanacheEntity {
    public String nome;
    public String dataNascimento;
    public String genero;
    public static List<Pessoa> findyAnyByGenero(String genero){
        return Pessoa.find("genero", genero).list();
    }
}
