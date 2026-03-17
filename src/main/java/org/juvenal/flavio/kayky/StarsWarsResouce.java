package org.juvenal.flavio.kayky;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("starwars")
public class StarsWarsResouce{
    @RestClient
    StarWarsService starWarsService;

    @GET
    @Path("starships")
    public String getStarships() {
        return starWarsService.getStarships();
    }

}
