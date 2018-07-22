package in.webxstudio.rest.quiz.api.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SingleAnswer {
	String question;
	Boolean answer;
	String subject;
	
	public SingleAnswer(){}
	
	public SingleAnswer(String question,String answer){
		this.question=question;
		if (answer == "true") {
			this.answer=true;
		}
		else
			this.answer=false;
	}
	
	public SingleAnswer(String question,String answer,String subject){
		this.question=question;
		if (answer == "true") {
			this.answer=true;
		}
		else
			this.answer=false;
		this.subject=subject;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}

	public void setAnswer(Boolean answer) {
		this.answer = answer;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getQuestion() {
		return this.question;
	}
	
	public Boolean getAnswer() {
		return this.answer;
	}

}
