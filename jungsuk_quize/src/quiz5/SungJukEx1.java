/*
 * quize4_1 / SungJukEx1.java
 * 프로그램 설명	: 
 * 작성 일자 		: 2012. 7. 12.
 * 작성자 		: 
*/
package quiz5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SungJukEx1 {
	public static void main(String[] args) { 
        ArrayList<Student> list = new ArrayList<Student>(); 

       //                        이름, 반, 번호, 국어, 수학, 영어 
        list.add(new Student("남궁성", 3,2,100,100,100)); 
        list.add(new Student("왕자바", 3,1,90,100,80)); 
        list.add(new Student("자바왕", 3,3,70,100,100)); 
        list.add(new Student("킹왕짱", 1,2,100,60,90)); 
        list.add(new Student("자바짱", 1,1,100,100,100)); 
        list.add(new Student("최고수", 1,3,100,80,60)); 
        list.add(new Student("홍길동", 2,1,50,80,100)); 
        list.add(new Student("일지매", 2,3,70,80,100)); 
        list.add(new Student("변강쇠", 2,4,80,80,85)); 
        list.add(new Student("이원구", 2,2,90,90,90));

        Collections.sort(list);
        printList(list); 
  } 

  public static void printList(List<Student> list) { 
        System.out.printf("%5s\t%2s\t%2s\t%3s\t%3s\t%3s\t%3s\n","이름","반","번호","국어","수학","영어","총점" ); 
        
        System.out.println("=================================="); 

        for(Student s : list) { 
              System.out.println(s); 
        } 

        System.out.println("=================================="); 
  } 
}
