package in.webxstudio.rest.quiz.api.truefalse;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import in.webxstudio.rest.quiz.api.connector.SendBoolean;
import in.webxstudio.rest.quiz.api.models.SingleAnswer;

@Path("boolean")
public class PostMethod {
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public SingleAnswer sendSuggestion(SingleAnswer getSuggestion) {
		SingleAnswer postedQuestion=getSuggestion;
		SendBoolean sender=new SendBoolean();
		sender.sendSuggestion(postedQuestion.getQuestion(), postedQuestion.getAnswer().toString(), postedQuestion.getSubject());
		return postedQuestion;
	}
}
