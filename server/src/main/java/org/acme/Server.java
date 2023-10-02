package org.acme;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Server {

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    public void hello(int number) {
        System.out.println(number);
    }
}