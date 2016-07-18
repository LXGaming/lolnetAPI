package nz.co.lolnet.restserver.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class HelloWorldResource {

    private static final String TEMPLATE = "Hello, %s!";

    @GET
    @Path("{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public String sayHello(@PathParam("name") String name){
        return "token is missing";
    }
    
    @GET
    @Path("{name}/{token}")
    @Produces(MediaType.APPLICATION_JSON)
    public String sayHello(@PathParam("name") String name, @PathParam("token") String token ){
        return (String.format(TEMPLATE, name)) + " With token:" + token;
    }
}
