package com.example.blog


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("/blog")
@Component
@Produces(MediaType.APPLICATION_JSON)
class EchoEndpoint {

  @Autowired
  lateinit var repository: ArticleRepository

  @GET
  fun echoGET(): Response {
    return Response.ok().entity(Message("Hello world!")).build()
  }

  @GET
  @Path("/article")
  fun articleGET(): Response {
    var articles = repository.findAll();
    return Response.ok().entity(articles).build()
  }

  /*@POST
  @Consumes(MediaType.APPLICATION_JSON)
  fun echoPOST(user: User): Response {
    if (user.name.isBlank()) {
      return Response.status(Response.Status.BAD_REQUEST).entity(Message("Passed parameter 'name' cannot be null or empty!")).build()
    }
    return Response.ok().entity(Message("Hello, ${user.name}!")).build()
  }*/
}
