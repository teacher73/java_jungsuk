/**
 *
 * @package		: lotto_create
 * @FileName	: Lotto.java
 * @Date  		: 2012. 9. 11.
 * @version  	: 1.0.0
 * @author  	: MinSu Kim (net94@nate.com)
 * @Comment  	: 로또 생성 클래스 
 * 
 */

package lotto_create;

import java.util.Random;

/**
 * 로또 생성 클래스 
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 9. 11. 오전 12:43:51
 * @version	1.0.0
 */

public class Lotto {
	/** 
	 * 로또 생성 유무 표시 배열 
	 */
	private boolean[] lotto;	
	
	private int arrSize;
	
	private int numSize;
	
	/**
	 * Constructor of Lotto.java class
	 * @param arrSize 로또번호 생성사이즈 ex) 45
	 * @param numSize 번호 생성 횟수
	 */

	public Lotto(int arrSize, int numSize) {
		this.arrSize = arrSize;
		this.numSize = numSize;
		this.lotto = new boolean[this.arrSize];
		initLotto();
	}
	
	/**
	 * 로또 번호 배열 초기화.
	 */
	
	public void initLotto(){
		for(int i=0; i<arrSize; i++){
			lotto[i] = false;
		}
	}
	
	/**
	 * 로또 번호 생성.
	 */
	
	
	public void createNum(){
		Random random = new Random();
		int num = random.nextInt(arrSize);
		if (!lotto[num]){
			lotto[num]=true;
		}else{
			createNum();
		}
	}
	
	/**
	 * 로또 번호 출력.
	 */
	
	public void prnLotto(){
		for(int i=0; i<arrSize; i++){
			if (lotto[i]) System.out.print(i+1 +"\t");
		}
		System.out.println();
	}
	
	/**
	 * 번호생성 메소드.
	 */
	
	public void lottoFactory(){
		for(int i=0; i<numSize; i++){
			createNum();
		}
		prnLotto();
		initLotto();
	}
}
