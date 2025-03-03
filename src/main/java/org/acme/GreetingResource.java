package org.acme;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Uni<String > hello() throws InterruptedException {
        return Uni.createFrom().item("Hello");
    }

    @Path("/fruits")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<List<Fruit>> getFruits() throws InterruptedException {
       // Thread.sleep(5000);
        return Fruit.listAll();
    }
}
