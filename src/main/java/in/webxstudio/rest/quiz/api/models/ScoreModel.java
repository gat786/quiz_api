package in.webxstudio.rest.quiz.api.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ScoreModel {
	String userName;
	int score;
	
	public ScoreModel(){}
	ScoreModel(String userName,int score){
		this.userName=userName;
		this.score=score;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
