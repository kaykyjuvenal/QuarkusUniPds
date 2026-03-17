package org.juvenal.flavio.kayky;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("starwars")
public class StarWarsResouce{
    @RestClient
    StarWarsService starWarsService;

    @GET
    @Path("starships")
    @Produces(MediaType.APPLICATION_JSON)
    public String getStarships() {
        return starWarsService.getStarships();
    }

}
