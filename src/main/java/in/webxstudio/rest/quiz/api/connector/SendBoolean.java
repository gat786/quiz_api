package in.webxstudio.rest.quiz.api.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.webxstudio.rest.quiz.api.models.SingleAnswer;

public class SendBoolean {
	private Connection connect;
	
	public SingleAnswer sendSuggestion(String questionGet,String answer,String subject) {
		SingleAnswer postedQuestion=null;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect=DriverManager.getConnection("jdbc:mysql://"+DatabaseInfo.dbHostUrl+":3306/"+DatabaseInfo.dbName, DatabaseInfo.dbUsername,DatabaseInfo.dbPassword);
			PreparedStatement statement=connect.prepareStatement("insert into suggestsingle (question,answer,subject) values (?,?,?);");
			statement.setString(1, questionGet);
			statement.setString(2, answer);
			statement.setString(3, subject);
			statement.executeUpdate();
		}
		catch(SQLException |ClassNotFoundException e )
		{
			e.printStackTrace();
		}
		return postedQuestion;
	}
	
	

}
