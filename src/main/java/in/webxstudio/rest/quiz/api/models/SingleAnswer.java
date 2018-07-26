package in.webxstudio.rest.quiz.api.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SingleAnswer {
	String question;
	String answer;
	String subject;
	
	public SingleAnswer(){}
	
	public SingleAnswer(String question,String answer){
		this.question=question;
		this.answer=answer;
	}
	
	public SingleAnswer(String question,String answer,String subject){
		this.question=question;
		this.answer=answer;
		this.subject=subject;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}

	public void setAnswer(String answer) {
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
	
	public String getAnswer() {
		return this.answer;
	}

}
