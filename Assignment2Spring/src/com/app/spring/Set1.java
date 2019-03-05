package com.app.spring;

import java.util.Set;

public class Set1 {

	private Set<Question> answers1;

	public Set1(Set<Question> answers1) {
		super();
		this.answers1 = answers1;
	}

	public Set1() {
		super();
	}

	public Set<Question> getAnswers1() {
		return answers1;
	}

	public void setAnswers1(Set<Question> answers1) {
		this.answers1 = answers1;
	}

	@Override
	public String toString() {
		return "Set1 [answers1=" + answers1 + "]";
	}
	public void show1()
	{
		for(Question s:answers1)
		{
			System.out.println(s.getQuestion()+" "+s.getAnswers());
		}
	}
	
}
