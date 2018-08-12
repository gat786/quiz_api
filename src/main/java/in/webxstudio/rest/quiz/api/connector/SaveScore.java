package in.webxstudio.rest.quiz.api.connector;
import in.webxstudio.rest.quiz.api.models.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class SaveScore {
	private Connection connect = null;
	public SaveScore(){}

	@SuppressWarnings("resource")
	public String SaveScoreToDb(ScoreModel score) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect=DriverManager.getConnection("jdbc:mysql://"+DatabaseInfo.dbHostUrl+":3306/"+DatabaseInfo.dbName, DatabaseInfo.dbUsername,DatabaseInfo.dbPassword);
			PreparedStatement statement=connect.prepareStatement("select * from score where username=\""+score.getUserName()+"\";");
			ResultSet result=statement.executeQuery();
			ScoreModel scoreRetrieved=new ScoreModel();
			while(result.next()) 
			{
				scoreRetrieved.setUserName(result.getString(1));
				scoreRetrieved.setScore(result.getInt(2));
			}
			if (scoreRetrieved.getScore()==0) 
			{
				 String query="insert into score (username,score) values ( ? , ? );";
				 PreparedStatement preparedStmt = connect.prepareStatement(query);
			     preparedStmt.setString (1, score.getUserName());
			     preparedStmt.setInt (2, score.getScore());
			     preparedStmt.execute();
			}
			else 
			{
				int updatedScore=scoreRetrieved.getScore()+score.getScore();
				statement=connect.prepareStatement("UPDATE score SET score="+updatedScore+" where username=\""+score.getUserName()+"\";");
				statement.executeUpdate();
			}
		}
		catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return "Saved";
	}
	
	public List<ScoreModel> getTopTenScore(){
		List<ScoreModel> topTen=new ArrayList<>();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect=DriverManager.getConnection("jdbc:mysql://"+DatabaseInfo.dbHostUrl+":3306/"+DatabaseInfo.dbName, DatabaseInfo.dbUsername,DatabaseInfo.dbPassword);
			PreparedStatement statement=connect.prepareStatement("SELECT * FROM score ORDER BY score DESC LIMIT 10;");
			ResultSet result=statement.executeQuery();
			while(result.next()) {
				ScoreModel score=new ScoreModel();
				score.setUserName(result.getString(1));
				score.setScore(result.getInt(2));
				topTen.add(score);
			}
			return topTen;
		}
		catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return topTen;
		}
	}
	

}
