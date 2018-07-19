package in.webxstudio.rest.quiz.api.models;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Multiple {
	private String Question,Option1,Option2,Option3,Answer;
	

	public Multiple() {}
	
	public Multiple(String Question,String Option1,String Option2,String Option3,String Answer) {
		this.Question=Question;
		this.Answer=Answer;
		this.Option1=Option1;
		this.Option2=Option2;
		this.Option3=Option3;
	}
	
	public void setQuestion(String question) {
		Question = question;
	}
	public void setOption1(String option1) {
		Option1 = option1;
	}
	public void setOption2(String option2) {
		Option2 = option2;
	}
	public void setOption3(String option3) {
		Option3 = option3;
	}
	public void setAnswer(String answer) {
		Answer = answer;
	}
	public String getQuestion() {
		return Question;
	}
	public String getOption1() {
		return Option1;
	}
	public String getOption2() {
		return Option2;
	}
	public String getOption3() {
		return Option3;
	}
	public String getAnswer() {
		return Answer;
	}
}
