/*
 * QuizEx1 / QuizEx1.java
 * 프로그램 설명	: [Java1000제] Simple Quiz 1 - 간단한 다지선다형 문제 (남궁성의 자바(java)초보스터디) |작성자 남궁성
 * 작성 일자 		: 2012. 7. 4.
 * 작성자 		: mskim
*/
package quiz2_02;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizEx2_2 {
	
	public static void main(String[] args){
		
		QuestionEntity question;
		ArrayList<QuestionEntity> qList = new ArrayList<QuestionEntity>();
		String[] data = { 
            "다음 중 키워드가 아닌 것은?`2`final`True`if`public", 
            "다음 중 자바의 연산자가 아닌 것은?`5`&`|`++`!=`/`^", 
            "다음 중 메서드의 반환값이 없음을 의미하는 키워드는?`1`void`null`false", 
		}; 
		Scanner sc = new Scanner(System.in); 
        int score = 0; 
        
		for(int i=0;i<data.length;i++) {
			qList.add(new QuestionEntity(data[i]));
		}
		
		for(int i=0; i<qList.size(); i++){
			question = qList.get(i);
			System.out.println("["+(i+1)+"] " + question.getExam());
			String[] selection = question.getSelection();
			for(int j=0; j<selection.length; j++){
		  		  System.out.print(j+1+". " + selection[j]+"\t");
			}
			System.out.println(); 
            /* 알맞은 코드를 넣으세요. */
			System.out.print("[답]"); 
            int input = sc.nextInt();

            if(input==question.getSolution()) { 
                  score++; 
            }

			System.out.println();System.out.println();
		}
		sc.close();
        // 알맞은 코드를 넣으세요.
        System.out.println("정답개수/전체문항수 : " + score+"/"+data.length);
	} // main 

}
