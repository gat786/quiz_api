package in.webxstudio.rest.quiz.api.models;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Multiple {
	private String question,option1,option2,option3,answer;
	private String subject;
	

	public Multiple() {}
	
	public Multiple(String question,String option1,String option2,String option3,String answer) {
		this.question=question;
		this.option1=option1;
		this.option2=option2;
		this.option3=option3;
		this.answer=answer;
	}
	public Multiple(String question,String option1,String option2,String option3,String answer,String subject) {
		this.question=question;
		this.option1=option1;
		this.option2=option2;
		this.option3=option3;
		this.answer=answer;
		this.subject=subject;
	}
	
	
	public String getQuestion() {
		return this.question;
	}
	public String getOption1() {
		return this.option1;
	}
	public String getOption2() {
		return this.option2;
	}
	public String getOption3() {
		return this.option3;
	}
	public String getAnswer() {
		return this.answer;
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
