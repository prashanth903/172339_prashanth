package com.app.spring;

import java.util.List;

public class List1 {

	private  List<Question> answers;

	public List1() {
		super();
	}

	public List<Question> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Question> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "List1 [answers=" + answers + "]";
	}

	public void show()
	{
		for(Question s:answers)
		{
			System.out.println(s.getQuestion()+" "+s.getAnswers());
		}
	}
}
