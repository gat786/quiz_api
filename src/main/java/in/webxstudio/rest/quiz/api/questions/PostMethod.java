package in.webxstudio.rest.quiz.api.questions;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import in.webxstudio.rest.quiz.api.connector.SendMultiple;
import in.webxstudio.rest.quiz.api.models.Multiple;

@Path("multiple")
public class PostMethod {
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String postMultiple(Multiple getSuggestion) {
		Multiple postedQuestion = getSuggestion;
		SendMultiple sender= new SendMultiple();
		sender.sendSuggestion(postedQuestion.getQuestion(), postedQuestion.getOption1(),  postedQuestion.getOption2(),  postedQuestion.getOption3(),  postedQuestion.getAnswer(),"science");
		
		return "Post Works";
	}
	
}
