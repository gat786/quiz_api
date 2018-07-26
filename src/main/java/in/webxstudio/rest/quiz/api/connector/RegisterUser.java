package in.webxstudio.rest.quiz.api.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.webxstudio.rest.quiz.api.models.UserProfile;

public class RegisterUser {

	private Connection connect = null;
	
	
	private String user;
	private String passwd;
	
	public RegisterUser(){
		user = "ganesh";
		passwd = "123456";
	}
	
	public UserProfile saveDataToBase(UserProfile userData) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/trivia_db", user, passwd);
			PreparedStatement statement=connect.prepareStatement("insert into users (username,email,password) values(?,?,?);");
			statement.setString(1, userData.getUsername());
			statement.setString(2, userData.getEmail());
			statement.setString(3, userData.getPassword());
			statement.executeUpdate();
			
		}
		catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return userData;
	}
	
}
