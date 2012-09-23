/*
 * QuizEx1 / QuizEx1.java
 * 프로그램 설명	: [Java1000제] Simple Quiz 1 - 간단한 다지선다형 문제 (남궁성의 자바(java)초보스터디) |작성자 남궁성
 * 작성 일자 		: 2012. 7. 4.
 * 작성자 		: mskim
*/
package quiz3;


public class QuizEx3 {
	
	public static void main(String[] args){
		String[] data = { 
            "다음 중 키워드가 아닌 것은?`2`final`True`if`public", 
            "다음 중 자바의 연산자가 아닌 것은?`5`&`|`++`!=`/`^", 
            "다음 중 메서드의 반환값이 없음을 의미하는 키워드는?`1`void`null`false", 
		}; 
		
		QuestionEntityList questionList= new QuestionEntityList();
		for(int i=0; i<data.length;i++){
			questionList.addExam(data[i]);
		}

		questionList.rndMakeQuestions();
		questionList.evalExam();
		
	} // main 
}
