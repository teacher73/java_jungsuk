package quiz1_01;

import org.apache.log4j.Logger;

/*
 * QuizEx1 / QuizEx1.java
 * 프로그램 설명	: [Java1000제] Simple Quiz 1 - 간단한 다지선다형 문제 (남궁성의 자바(java)초보스터디) |작성자 남궁성
 * 작성 일자 	: 2012. 7. 4.
 * 작성자 		: mskim
*/

public class QuizEx1_01 {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(QuizEx1_01.class);
	
	public static void main(String[] args){
		if (logger.isDebugEnabled()) {
			logger.debug("main() - start main");
		}

		String[] data = { 
            "다음 중 키워드가 아닌 것은?`2`final`True`if`public", 
            "다음 중 자바의 연산자가 아닌 것은?`5`&`|`++`!=`/`^", 
            "다음 중 메서드의 반환값이 없음을 의미하는 키워드는?`1`void`null`false", 
		}; 
		

      for(int i=0;i<data.length;i++) {
          // 1. String클래스의 String[] split(String regex, int limit)를 사용해서 문제와 선택지를 나누세요.
    	  String[] temp = data[i].split("`", 3);
    	  String question = temp[0];
//    	  String answer = temp[1];
    	  // 2. 선택지를 나누기 위해 String[] split(String regex)를 사용하세요.
    	  String[] choices = temp[2].split("`");
    	  
          // 3. 문제를 출력하세요.
    	  System.out.println("["+(i+1)+"] "+question);
    	  
          // 4.반복문을 이용해서 선택지를 출력하세요.
    	  for(int j=0; j<choices.length; j++){
    		  System.out.print(j+1+". " + choices[j]+"\t");
    	  }
    	  System.out.println();
      } 
      if (logger.isDebugEnabled()) {
			logger.debug("main() - end main");
		}
      
	} // main 

}
