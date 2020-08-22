package com.it.wcj.springbootdubboprovider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public interface ISayService {

    @GET
    @Path("/say")
    String sayHello(String msg);
}
