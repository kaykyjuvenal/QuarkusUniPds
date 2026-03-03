package org.juvenal.flavio.kayky;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDate;

@Path("/unipds")
@Produces(MediaType.TEXT_PLAIN) //produz em text_plain
@Consumes(MediaType.TEXT_PLAIN) //consome text plan

public class UniPDSFistTestResource {

    private int i;

    @GET
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
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

    public UniPDSFistTestResource(int i) {
        this.setI(i);
    }
    @GET
    @Path("/id1")
    public int getId1(){
        return LocalDate.now().getDayOfMonth();
    }
}
