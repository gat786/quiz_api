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

	public List<SingleAnswer> getBoolean(String table_name){
		Connection connect = null;
		ResultSet set;
		List<SingleAnswer> data=new ArrayList<>();
		int count=0;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect=DriverManager.getConnection("jdbc:mysql://"+DatabaseInfo.dbHostUrl+":3306/"+DatabaseInfo.dbName, DatabaseInfo.dbUsername,DatabaseInfo.dbPassword);
			SingleAnswer dataRetrieve;
			List<SingleAnswer> returnData=new ArrayList<>();
			PreparedStatement statement=connect.prepareStatement("select count(*) from "+table_name+";");
			set=statement.executeQuery();
			while(set.next()){
				count=set.getInt(1);
			}
			System.out.println(count);

			List<Integer> questionIds=randomGenerator(count);

			for(Integer question:questionIds){
				PreparedStatement statement=connect.prepareStatement("select * from "+table_name+" where id="+question+";");
				set=statement.executeQuery();
				while(set.next()) 
				{
					dataRetrieve=new SingleAnswer(set.getString(2),set.getString(3));
					returnData.add(dataRetrieve);
				}
			}
			connect.close();
			data=returnData;
			System.out.println("Data retrieved Successfully");
		}
		catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return data;
	}

	List<Integer> randomGenerator(int maxNumber){
		Random rand=new Random();
		List<Integer> questionsList=new ArrayList<>(); 
		while (questionsList.size()<10) {
			int number=rand.nextInt(maxNumber);
			if(!questionsList.contains( number))
				questionsList.add(number);
		}
		return questionsList;
	}
	
}
