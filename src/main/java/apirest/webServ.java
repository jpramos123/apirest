package apirest;

import java.util.ArrayList;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("api")
public class webServ {

	static ArrayList<Aluno> al = new ArrayList<Aluno>();
	
	@POST
	@Path("insere")
	public void insereAluno(@QueryParam("id") int id, @QueryParam("nome") String nome, 
			@QueryParam("idade") int idade, @QueryParam("curso") String curso) {
		

		Aluno insere = new Aluno(id, nome, idade, curso);
		al.add(insere);
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON})
	@Path("retorna")
	public Response retorna()
	{
		return Response.ok(al).header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON).build();
	}
	
	@DELETE
	@Path("delete")
	public void clean()
	{
		al.clear();
	}
}
