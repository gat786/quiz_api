package in.webxstudio.rest.quiz.api.truefalse;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import in.webxstudio.rest.quiz.api.connector.GetBoolean;
import in.webxstudio.rest.quiz.api.models.SingleAnswer;

@Path("boolean")
public class TrueFalse {
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String QuestionsBase() {
		String index="<h3>You're in Multiple Choice Home Select Your Subject</h3> "
				+ "		<br>For Science <a href='/webapi/boolean/science'>Click here</a>"
				+ "		<br>For History <a href='/webapi/boolean/history'>Click here</a>"
				+ "		<br>For Geography <a href='/webapi/boolean/geography'>Click here</a>"
				+ "		<br>For Computer Science <a href='/webapi/boolean/computers'>Click here</a>"
				+ "		<br>For Mythology <a href='/webapi/boolean/mythology'>Click here</a>"
				+ "		<br>For Sports <a href='/webapi/boolean/sports'>Click here</a>"
				+ "		<br>For Films <a href='/webapi/boolean/films'>Click here</a>";
		return index;
	}
	
	
	@Path("science")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<SingleAnswer> Science() {
		GetBoolean single=new GetBoolean();
		List<SingleAnswer> data=new ArrayList<>();
		data=single.getBoolean("science_boolean");
		return data;
	}
	
	
	
	@Path("history")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public  List<SingleAnswer> History() {
		GetBoolean single=new GetBoolean();
		List<SingleAnswer> data=new ArrayList<>();
		data=single.getBoolean("history_boolean");
		return data;
	}
	
	
	
	@Path("geography")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public  List<SingleAnswer> Geography() {
		GetBoolean single=new GetBoolean();
		List<SingleAnswer> data=new ArrayList<>();
		data=single.getBoolean("geography_boolean");
		return data;
	}
	
	
	
	@Path("computers")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public  List<SingleAnswer> ComputerScience() {
		GetBoolean single=new GetBoolean();
		List<SingleAnswer> data=new ArrayList<>();
		data=single.getBoolean("computers_boolean");
		return data;
	}
	
	
	
	@Path("films")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public  List<SingleAnswer> Films() {
		GetBoolean single=new GetBoolean();
		List<SingleAnswer> data=new ArrayList<>();
		data=single.getBoolean("films_boolean");
		return data;
	}
	
	
	
	@Path("mythology")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public  List<SingleAnswer> Mythology() {
		GetBoolean single=new GetBoolean();
		List<SingleAnswer> data=new ArrayList<>();
		data=single.getBoolean("mythology_boolean");
		return data;
	}
	
	
	
	@Path("sports")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public  List<SingleAnswer> Sports() {
		GetBoolean single=new GetBoolean();
		List<SingleAnswer> data=new ArrayList<>();
		data=single.getBoolean("sports_boolean");
		return data;
	}
}
