package in.webxstudio.rest.quiz.api.connector;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import in.webxstudio.rest.quiz.api.models.*;

public class GetMultiple {
		
		private Connection connect = null;
		
		private ResultSet set;
		
		
		public GetMultiple(){
		}
		
		public List<Multiple> GetMultipleData(String table_name)
		{
			List<Multiple> data=new ArrayList<>();
			
			try 
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				connect=DriverManager.getConnection("jdbc:mysql://"+DatabaseInfo.dbHostUrl+":3306/"+DatabaseInfo.dbName, DatabaseInfo.dbUsername,DatabaseInfo.dbPassword);
				//data=getData("science_easy_multiple");
				Multiple dataRetrive;
				List<Multiple> returnData=new ArrayList<>();
				PreparedStatement statement=connect.prepareStatement("select * from "+table_name+";");
				set=statement.executeQuery();
				while(set.next()) 
				{
					dataRetrive=new Multiple(set.getString(1),set.getString(2),set.getString(3),set.getString(4),set.getString(5));
					returnData.add(dataRetrive);
				}
				connect.close();
				System.out.println("Data retrieved Successfully");
				data=returnData;
			}
			catch(SQLException | ClassNotFoundException e) 
			{
				e.printStackTrace();
			}
			System.out.println(data);
			List<Integer> questionsList=new ArrayList<>(); 
			Random rand=new Random();
			while (questionsList.size()<10) {
				int number=rand.nextInt(data.size());
				if(!questionsList.contains( number))
					questionsList.add(number);
			}
			List<Multiple> dataReturnable=new ArrayList<>();
			for(int a:questionsList) {
				dataReturnable.add(data.get(a));
			}
			return dataReturnable;
		}
}