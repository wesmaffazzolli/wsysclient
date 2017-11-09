/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.tads.web.resources;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Wesley
 */
@Path("teste")
public class TesteResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of TesteResource
     */
    public TesteResource() {
    }

    /**
     * Retrieves representation of an instance of ws.TesteResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        return "{\"pessoaFisica\" : {\n" + "   \"nome\" : \"Razer\",\n" + "   \"cpf\" : \"123.456.789-09\"\n" + "   }\n" + "}";
    }

    /**
     * PUT method for updating or creating an instance of TesteResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
