package in.webxstudio.rest.quiz.api.connector;

import in.webxstudio.rest.quiz.api.models.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GetBoolean {
	private Connection connect = null;
	
	private ResultSet set;
	
	private String user;
	private String passwd;
	
	public GetBoolean(){
		user = "ganesh";
		passwd = "123456";
	}
	
	public List<SingleAnswer> getBoolean(String table_name){
		List<SingleAnswer> data=new ArrayList<>();
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/trivia_db", user, passwd);
			SingleAnswer dataRetrive;
			List<SingleAnswer> returnData=new ArrayList<>();
			PreparedStatement statement=connect.prepareStatement("select * from "+table_name+";");
			set=statement.executeQuery();
			while(set.next()) 
			{
				dataRetrive=new SingleAnswer();
				returnData.add(dataRetrive);
			}
			connect.close();
			System.out.println("Data retrieved Successfully");
		}
		catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		Random rand=new Random();
		List<Integer> questionsList=new ArrayList<>(); 
		while (questionsList.size()<10) {
			int number=rand.nextInt(data.size());
			if(!questionsList.contains( number))
				questionsList.add(number);
		}
		List<SingleAnswer> dataReturnable=new ArrayList<>();
		for(int a:questionsList) {
			dataReturnable.add(data.get(a));
		}
		return dataReturnable;
	}
	
}
