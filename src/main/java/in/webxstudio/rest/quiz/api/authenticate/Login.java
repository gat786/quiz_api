package in.webxstudio.rest.quiz.api.authenticate;
import in.webxstudio.rest.quiz.api.connector.LoginUser;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import in.webxstudio.rest.quiz.api.models.UserProfile;

@Path("login")
public class Login {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Boolean LoginUser(UserProfile profile) {
		Boolean result;
		LoginUser logger=new LoginUser();
		result=logger.loginWithData(profile);
		return result;
	}
}
