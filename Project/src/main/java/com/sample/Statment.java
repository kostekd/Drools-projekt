package com.sample;

public class Statment{
    public String answer;
    public String question;
    
    public Statment() {
    	
    }

    public Statment(String question,String answer) {
    	this.question = question;
    	this.answer = answer;
    	
        
    }
    public String getQuestion() {
        return question;
    }

    public String getStatment() {
        return answer;
    }

    public void setStatment(String answer) {
        this.answer = answer;
    }

    
}