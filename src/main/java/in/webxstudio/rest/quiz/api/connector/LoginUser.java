package in.webxstudio.rest.quiz.api.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import in.webxstudio.rest.quiz.api.models.UserProfile;


public class LoginUser {
	
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public Boolean loginWithData(UserProfile givenData) {
		Connection connect = null;
		Boolean result;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect=DriverManager.getConnection("jdbc:mysql://"+DatabaseInfo.dbHostUrl+":3306/"+DatabaseInfo.dbName, DatabaseInfo.dbUsername,DatabaseInfo.dbPassword);
			//connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/trivia_db", "ganesh", "123456");
			PreparedStatement statement=connect.prepareStatement("select * from users where username=+\""+givenData.getUsername()+"\";");
			ResultSet rs=statement.executeQuery();
			String retrievedPassword="";
			while(rs.next()) 
			{
				retrievedPassword=rs.getString(4);
			}
			
				if (retrievedPassword.equals(givenData.getPassword())) 
					result=true;			
				else
					result=false;
			
		}
		catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			result=false;
		}
		return result;
	}

}
