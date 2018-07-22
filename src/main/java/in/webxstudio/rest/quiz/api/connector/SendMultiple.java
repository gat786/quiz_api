package in.webxstudio.rest.quiz.api.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.webxstudio.rest.quiz.api.models.*;

public class SendMultiple {

	private Connection connect = null;
	
	
	private String user;
	private String passwd;
	
	public SendMultiple(){
		user = "ganesh";
		passwd = "123456";
	}
	
	public Multiple sendSuggestion(String questionGet,String option1 ,String option2,String option3,String answer,String subject) {
		Multiple question=new Multiple();
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/trivia_db", user, passwd);
			PreparedStatement statement=connect.prepareStatement("insert into suggestmultiple values (?,?,?,?,?,?);");
			statement.setString(1, questionGet);
			statement.setString(2, option1);
			statement.setString(3, option2);
			statement.setString(4, option3);
			statement.setString(5, answer);
			statement.setString(6, subject);
			statement.executeUpdate();
		}
		catch(SQLException |ClassNotFoundException e )
		{
			e.printStackTrace();
		}
		
		return question;
	}
}
