package in.webxstudio.rest.quiz.api.connector;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import in.webxstudio.rest.quiz.api.models.*;

public class GetMultiple {
			
	public List<Multiple> getMultipleData(String table_name)
	{
		Connection connect = null;
		ResultSet set;
		
		List<Multiple> data=new ArrayList<>();
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect=DriverManager.getConnection("jdbc:mysql://"+DatabaseInfo.dbHostUrl+":3306/"+DatabaseInfo.dbName, DatabaseInfo.dbUsername,DatabaseInfo.dbPassword);
			
			Multiple dataRetrive;
			List<Multiple> returnData=new ArrayList<>();
			int count=0;

			PreparedStatement statement=connect.prepareStatement("select count(*) from "+table_name+";");
			set=statement.executeQuery();

			while(set.next()){
				count=set.getInt(1);
			}

			System.out.println(count);

			List<Integer> questionNumbers=randomGenerator(count);

			for (Integer question:questionNumbers){
				statement=connect.prepareStatement("select * from "+table_name+" where id="+question+";");
				set=statement.executeQuery();
				while(set.next()){
					dataRetrive=new Multiple(set.getString(2),set.getString(3),set.getString(4),set.getString(5),set.getString(6));
					returnData.add(dataRetrive);
				}
			}
			connect.close();
			data=returnData;
		}
		catch(SQLException | ClassNotFoundException e) 
		{
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
