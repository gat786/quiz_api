package in.webxstudio.rest.quiz.api.authenticate;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;

import in.webxstudio.rest.quiz.api.connector.RegisterUser;
import in.webxstudio.rest.quiz.api.models.UserProfile;

@Path("register")
public class Register {

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public String resgisterUser(UserProfile unregisteredUser) {
		UserProfile newProfile=unregisteredUser;
		RegisterUser registerer=new RegisterUser();
		String result = registerer.saveDataToBase(newProfile);
		return result;
	}
}
