/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.tads.web.resources;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Wesley
 */
@Path("pessoas")
public class PessoasResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PessoasResource
     */
    public PessoasResource() {
    }

    /*@POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Pessoa inserirPessoa(Pessoa p) {
        // inserção no BD e obtenção do ID 
        p.setId(10);
        return p;
    }*/

    /**
     * Retrieves representation of an instance of ws.PessoasResource
     *
     * @param dia
     * @param ano
     * @param mes
     * @return an instance of java.lang.String
     */
    /*@GET
    @Path("/{dia}/{mes}/{ano}")
    @Produces(MediaType.APPLICATION_JSON)
    public Pessoa obterPessoa(
            @PathParam("dia") int dia,
            @PathParam("mes") int mes,
            @PathParam("ano") int ano) {
        Pessoa p = new Pessoa();
        p.setId(10);
        p.setNome("Razer");
        List listaEmail = new ArrayList<String>();
        listaEmail.add("razer.anthom@gmail.com");
        p.setEmails(listaEmail);
        Calendar cal = Calendar.getInstance();
        cal.set(ano, mes - 1, dia);
        Date dt = cal.getTime();
        p.setDate(dt);
        return p;
    }*/

    /**
     * PUT method for updating or creating an instance of PessoasResource
     *
     * @param content representation for the resource
     */
    /*@PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }*/
}
