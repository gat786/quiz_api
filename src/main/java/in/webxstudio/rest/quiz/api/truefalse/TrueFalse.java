package in.webxstudio.rest.quiz.api.truefalse;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("boolean")
public class TrueFalse {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String QuestionsBase() {
		return "You reached Single Answer Questions Root Please Select a Subject";
	}
	
	
	@Path("science")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String Science() {
		return "Science Questions";
	}
	
	
	
	@Path("history")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String History() {
		return "History Questions";
	}
	
	
	
	@Path("geography")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String Geography() {
		return "Geography Questions";
	}
	
	
	
	@Path("computers")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String ComputerScience() {
		return "ComputerScience Questions";
	}
	
	
	
	@Path("films")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String Films() {
		return "Films Questions";
	}
	
	
	
	@Path("mythology")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String Mythology() {
		return "Mythology Questions";
	}
	
	
	
	@Path("sports")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String Sports() {
		return "Sports Questions";
	}
}
