package org.juvenal.flavio.kayky;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDate;
import java.util.UUID;

@Path("/unipds")
@Produces(MediaType.TEXT_PLAIN) //produz em text_plain
@Consumes(MediaType.TEXT_PLAIN) //consome text plan

public class UniPDSFistTestResource {

    private int i = UUID.randomUUID().hashCode();

    @GET
    public int getI() {
        return i;
    }


    @POST
    public void addI() {
        i++;
    }
    @DELETE
    public void removeI() {
        i--;
    }
    @PUT
    public void updateI(int i) {
        this.i = i;
    }

    @GET
    @Path("/id1")
    public int getId1(){
        return LocalDate.now().getDayOfMonth();
    }
}
