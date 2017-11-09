/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.tads.web.resources;

import br.ufpr.tads.web.dao.FuncionarioDao;
import br.ufpr.tads.web.model.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Wesley
 */
@Path("funcionarios")
public class FuncionariosResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of FuncionariosResource
     */
    public FuncionariosResource() {
    }

    /**
     * Retrieves representation of an instance of
     * br.ufpr.tads.web.resources.FuncionariosResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFuncionarios() {
        FuncionarioDao funcionarioDao = new FuncionarioDao();
        List<Funcionario> lista = new ArrayList<Funcionario>();
        lista = funcionarioDao.findAll();
        if (lista != null) {
            GenericEntity<List<Funcionario>> listaX = new GenericEntity<List<Funcionario>>(lista) {
            };
            Response resp = Response.ok().entity(listaX).build();
            return resp;
        } else {
            return null;
        }
    }

    @GET
    @Path("/search/{search}")
    @Produces(MediaType.APPLICATION_JSON+";charset=utf-8")
    public Response getFuncionariosByName(
            @PathParam("search") String search) {
        FuncionarioDao funcionarioDao = new FuncionarioDao();
        List<Funcionario> lista = new ArrayList<Funcionario>();
        lista = funcionarioDao.findByName(search);
        if (lista != null) {
            GenericEntity<List<Funcionario>> listaX = new GenericEntity<List<Funcionario>>(lista) {
            };
            Response resp = Response.ok().entity(listaX).build();
            return resp;
        } else {
            return null;
        }
    }

    //GET funcionário por ID
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Funcionario getFuncionarioById(
            @PathParam("id") String id) {
        FuncionarioDao funcionarioDao = new FuncionarioDao();
        Funcionario funcionario = funcionarioDao.findById(id);
        if (funcionario != null) {
            return funcionario;
        } else {
            return null;
        }
    }

    @GET
    @Path("empresa/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Funcionario> getFuncionariosByEmpresa(
            @PathParam("id") String id) {
        FuncionarioDao funcionarioDao = new FuncionarioDao();
        List<Funcionario> lista = new ArrayList<Funcionario>();
        lista = funcionarioDao.findByEmpresa(id);
        if (lista != null) {
            return lista;
        } else {
            return null;
        }
    }

    /*
    @POST SECTION     
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Funcionario insertFuncionario(Funcionario funcionario) {
        FuncionarioDao funcionarioDao = new FuncionarioDao();
        if (funcionarioDao.insert(funcionario)) {
            return funcionario;
        } else {
            return null;
        }
    }

    /**
     * PUT method for updating or creating an instance of FuncionariosResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Funcionario updateFuncionario(Funcionario funcionario) {
        FuncionarioDao funcionarioDao = new FuncionarioDao();
        if (funcionarioDao.update(funcionario)) {
            return funcionario;
        } else {
            return null;
        }
    }

    /* 
    @DELETE section    
     */
    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public void removeFuncionario(
            @PathParam("id") String id) {
        FuncionarioDao funcionarioDao = new FuncionarioDao();
        funcionarioDao.remove(id);
    }
}
