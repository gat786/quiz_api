package in.webxstudio.rest.quiz.api.questions;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.*;
import in.webxstudio.rest.quiz.api.connector.*;
import in.webxstudio.rest.quiz.api.models.*;

import javax.ws.rs.core.MediaType;

@Path("multiple")
public class Questions{
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String questionsBase()  {
		String index="<h3>You're in Multiple Choice Home Select Your Subject</h3> "
				+ "		<br>For Science <a href='/webapi/multiple/science'>Click here</a>"
				+ "		<br>For History <a href='/webapi/multiple/history'>Click here</a>"
				+ "		<br>For Geography <a href='/webapi/multiple/geography'>Click here</a>"
				+ "		<br>For Computer Science <a href='/webapi/multiple/computers'>Click here</a>"
				+ "		<br>For Mythology <a href='/webapi/multiple/mythology'>Click here</a>"
				+ "		<br>For Sports <a href='/webapi/multiple/sports'>Click here</a>"
				+ "		<br>For Films <a href='/webapi/multiple/films'>Click here</a>";
		return index;
	}
	
	
	
	@GET
	@Path("science")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Multiple> science() {
		GetMultiple multiple=new GetMultiple();
		List<Multiple> data=new ArrayList<>();
		data=multiple.getMultipleData("science_easy_multiple");
		return data;
	}
	
	
	
	
	@Path("history")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Multiple> history() {
		GetMultiple multiple=new GetMultiple();
		List<Multiple> data=new ArrayList<>();
		data=multiple.getMultipleData("history_easy_multiple");
		return data;
	}
	
	
	
	@Path("geography")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Multiple> geography() {
		GetMultiple multiple=new GetMultiple();
		List<Multiple> data=new ArrayList<>();
		data=multiple.getMultipleData("geography_easy_multiple");
		return data;
	}
	
	
	
	@Path("computers")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Multiple> computerScience() {
		GetMultiple multiple=new GetMultiple();
		List<Multiple> data=new ArrayList<>();
		data=multiple.getMultipleData("computers_easy_multiple");
		return data;
	}
	
	
	
	@Path("films")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Multiple> films() {
		GetMultiple multiple=new GetMultiple();
		List<Multiple> data=new ArrayList<>();
		data=multiple.getMultipleData("films_easy_multiple");
		return data;
	}
	
	
	
	@Path("mythology")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Multiple> mythology() {
		GetMultiple multiple=new GetMultiple();
		List<Multiple> data=new ArrayList<>();
		data=multiple.getMultipleData("mythology_easy_multiple");
		return data;
	}
	
	
	
	@Path("sports")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Multiple> sports() {
		GetMultiple multiple=new GetMultiple();
		List<Multiple> data=new ArrayList<>();
		data=multiple.getMultipleData("sports_easy_multiple");
		return data;
	}
}
