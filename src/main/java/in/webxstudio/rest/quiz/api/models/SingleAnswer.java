package in.webxstudio.rest.quiz.api.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SingleAnswer {
	String Question;
	Boolean Answer;
	
	public SingleAnswer(){}
	
	public SingleAnswer(String Question,Boolean Answer){
		this.Question=Question;
		this.Answer=Answer;
	}
	
	public String getQuestion() {
		return this.Question;
	}
	
	public Boolean getAnswer() {
		return this.Answer;
	}

}
