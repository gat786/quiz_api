package in.webxstudio.rest.quiz.api.authenticate;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import in.webxstudio.rest.quiz.api.connector.SaveScore;
import in.webxstudio.rest.quiz.api.models.ScoreModel;

@Path("score")
public class Scores {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<ScoreModel> getScoreList(ScoreModel score) {
		SaveScore saver=new SaveScore();
		saver.SaveScoreToDb(score);
		List<ScoreModel> scores=saver.getTopTenScore();
		return scores;
	}

}
