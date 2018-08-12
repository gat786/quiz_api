package in.webxstudio.rest.quiz.api.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.webxstudio.rest.quiz.api.models.UserProfile;

public class RegisterUser {

	private Connection connect = null;
	
	
	
	public RegisterUser(){
		
	}
	
	public Boolean saveDataToBase(UserProfile userData) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect=DriverManager.getConnection("jdbc:mysql://"+DatabaseInfo.dbHostUrl+":3306/"+DatabaseInfo.dbName, DatabaseInfo.dbUsername,DatabaseInfo.dbPassword);
			PreparedStatement statement=connect.prepareStatement("insert into users (username,email,password) values(?,?,?);");
			statement.setString(1, userData.getUsername());
			statement.setString(2, userData.getEmail());
			statement.setString(3, userData.getPassword());
			statement.executeUpdate();
			return true;
			
		}
		catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
