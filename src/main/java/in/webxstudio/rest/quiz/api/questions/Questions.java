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
	public String QuestionsBase()  {
		String index="<h3>You're in Multiple Choice Home Select Your Subject</h3> "
				+ "		<br>For Science <a href='/api/webapi/multiple/science'>Click here</a>"
				+ "		<br>For History <a href='/api/webapi/multiple/history'>Click here</a>"
				+ "		<br>For Geography <a href='/api/webapi/multiple/geography'>Click here</a>"
				+ "		<br>For Computer Science <a href='/api/webapi/multiple/computers'>Click here</a>"
				+ "		<br>For Mythology <a href='/api/webapi/multiple/mythology'>Click here</a>"
				+ "		<br>For Sports <a href='/api/webapi/multiple/sports'>Click here</a>"
				+ "		<br>For Films <a href='/api/webapi/multiple/films'>Click here</a>";
		return index;
	}
	
	
	
	@GET
	@Path("science")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Multiple> Science() {
		GetMultiple multiple=new GetMultiple();
		List<Multiple> data=new ArrayList<>();
		data=multiple.GetMultipleData("science_easy_multiple");
		return data;
	}
	
	
	
	
	@Path("history")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Multiple> History() {
		GetMultiple multiple=new GetMultiple();
		List<Multiple> data=new ArrayList<>();
		data=multiple.GetMultipleData("history_easy_multiple");
		return data;
	}
	
	
	
	@Path("geography")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Multiple> Geography() {
		GetMultiple multiple=new GetMultiple();
		List<Multiple> data=new ArrayList<>();
		data=multiple.GetMultipleData("geography_easy_multiple");
		return data;
	}
	
	
	
	@Path("computers")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Multiple> ComputerScience() {
		GetMultiple multiple=new GetMultiple();
		List<Multiple> data=new ArrayList<>();
		data=multiple.GetMultipleData("computers_easy_multiple");
		return data;
	}
	
	
	
	@Path("films")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Multiple> Films() {
		GetMultiple multiple=new GetMultiple();
		List<Multiple> data=new ArrayList<>();
		data=multiple.GetMultipleData("films_easy_multiple");
		return data;
	}
	
	
	
	@Path("mythology")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Multiple> Mythology() {
		GetMultiple multiple=new GetMultiple();
		List<Multiple> data=new ArrayList<>();
		data=multiple.GetMultipleData("mythology_easy_multiple");
		return data;
	}
	
	
	
	@Path("sports")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Multiple> Sports() {
		GetMultiple multiple=new GetMultiple();
		List<Multiple> data=new ArrayList<>();
		data=multiple.GetMultipleData("sports_easy_multiple");
		return data;
	}
}
