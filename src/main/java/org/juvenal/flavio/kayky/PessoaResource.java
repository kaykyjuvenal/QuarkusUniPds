package org.juvenal.flavio.kayky;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("pessoa")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PessoaResource {
    @GET
    public List<Pessoa> getPessoas(){
        return Pessoa.listAll();
    }
    @POST
    @Transactional
    public Pessoa addPessoa(Pessoa pessoa){
        pessoa.id = null;
        pessoa.persist();

        return pessoa;
    }
    @PUT
    @Transactional
    public Pessoa updatePessoa(Pessoa pessoa){
        Pessoa p =  Pessoa.findById(pessoa.id);
        p.nome = pessoa.nome;
        p.dataNascimento = pessoa.dataNascimento;
        p.persist();
        return p;
    }
    @DELETE
    @Transactional
    public void deletePessoa(int id){
        Pessoa p =  Pessoa.findById(id);
        p.delete();
    }
}
