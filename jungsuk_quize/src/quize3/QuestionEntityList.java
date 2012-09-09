/*
 * quizex2_3 / QuestionEntityList.java
 * 프로그램 설명	: 
 * 작성 일자 		: 2012. 7. 6.
 * 작성자 		: 
*/
package quize3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuestionEntityList {
	
	private QuestionEntity question;
	private ArrayList<QuestionEntity> qList;
	int score;

	
	public QuestionEntityList() {
		qList = new ArrayList<QuestionEntity>();
	}

	public void addExam(String data){
		String[] examString = data.split("`", 3);
		String exam = examString[0];
		int solution = Integer.parseInt(examString[1]);
		String[] selection = examString[2].split("`");
		
		qList.add(new QuestionEntity(exam, solution, selection));
	}
	
	public void rndMakeQuestions(){
		Scanner sc = new Scanner(System.in);
		
		Collections.shuffle(qList);
		
		for(int i=0; i<qList.size(); i++){
			question = qList.get(i);
			System.out.println("["+(i+1)+"] " + question.getExam());
			String[] selection = question.getSelection();
			
			
			ArrayList<String> sels = new ArrayList<String>();
			Collections.addAll(sels, selection);
			Collections.shuffle(sels);
			
			String sol = selection[question.getSolution()-1];
			question.setSolution(sels.indexOf(sol)+1);
			
			for(int j=0; j<sels.size(); j++){
		  		  System.out.print(j+1+". " + sels.get(j)+"\t");
			}
			

			System.out.println(); 
			System.out.print("[답]"); 
			
            int input = sc.nextInt();
            question.setUserSolution(input);

			System.out.println();
		}
		sc.close();
	}
	
	public void makeQuestions(){
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<qList.size(); i++){
			question = qList.get(i);
			System.out.println("["+(i+1)+"] " + question.getExam());
			String[] selection = question.getSelection();

			for(int j=0; j<selection.length; j++){
		  		  System.out.print(j+1+". " + selection[j]+"\t");
			}

			System.out.println(); 
			System.out.print("[답]"); 
			
            int input = sc.nextInt();
            question.setUserSolution(input);

			System.out.println();
		}
		sc.close();
	}
	
	public void evalExam(){
		for(int i=0; i<qList.size(); i++){
			question = qList.get(i);
			if (question.getUserSolution()==question.getSolution()){
				score++;
			}
		}
		System.out.println("정답개수/전체문항수 : " + score+"/"+qList.size());
		System.out.println();
	}
}
