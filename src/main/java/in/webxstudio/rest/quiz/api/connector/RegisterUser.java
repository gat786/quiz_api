package in.webxstudio.rest.quiz.api.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import in.webxstudio.rest.quiz.api.models.UserProfile;

public class RegisterUser {
	
	public String saveDataToBase(UserProfile userData) {
		Connection connect = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect=DriverManager.getConnection("jdbc:mysql://"+DatabaseInfo.dbHostUrl+":3306/"+DatabaseInfo.dbName+"?useSSl=false", DatabaseInfo.dbUsername,DatabaseInfo.dbPassword);
			boolean usernameFind=checkDuplicate(userData.getUsername(), "username");
			boolean emailFind=checkDuplicate(userData.getEmail(), "email");
			if(usernameFind!=true && emailFind!=true) {
				PreparedStatement statement=connect.prepareStatement("insert into users (username,email,password) values(?,?,?);");
				statement.setString(1, userData.getUsername());
				statement.setString(2, userData.getEmail());
				statement.setString(3, userData.getPassword());
				statement.executeUpdate();
				return "true";
			}
			else {
				if (usernameFind==true) {
					return "username";
				}
				else {
					return "email"; 
				}
			}
			
		}
		catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return "false";
		}
	}
	
	public Boolean checkDuplicate(String value,String field) {
		Connection connect = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect=DriverManager.getConnection("jdbc:mysql://"+DatabaseInfo.dbHostUrl+":3306/"+DatabaseInfo.dbName+"?useSSl=false", DatabaseInfo.dbUsername,DatabaseInfo.dbPassword);
			String sql="select id from users where "+field+"=\""+value+"\";";
			Statement statement=connect.createStatement();
			ResultSet set=statement.executeQuery(sql);
			int count=0;
			while(set.next()) {
				count++;
			}
			if(count!=0) {
				return true;
			}
		}
		catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}
	
}
