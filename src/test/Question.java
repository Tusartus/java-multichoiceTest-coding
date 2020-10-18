/**
 * Multiple choice test 
 * -------------------
 * prepare a question set with answers
 * display questions randomly
 * display choices randomly
 * put questions into a Game instance
 * record number of correct answers of that Game instance
 * 
 * 
 */

package test;

import java.util.ArrayList;
import java.util.Collections;

public class Question {
	private String question;
	private ArrayList<String> choices;
	private String answer;
	
	public Question(String question, String[] choices, String answer) {
		
		 this.question = question;
		 this.choices= new ArrayList<String>();
		 for(int i = 0; i < choices.length; i++) {
			   this.choices.add(choices[i]);
		 }
		 // each game must show questions in different order
		 Collections.shuffle(this.choices); //shuffle method 
		 this.answer = answer;
		 
	}
	
	//method getQuestion
	public String getQuestion() {
		  return question;
	}
	
	public ArrayList<String> getChoices(){
		  return choices;
	}
	
	public String getAnswer() {
		return answer;
	}
	

}
