package lotto_create;

import java.util.Random;


// TODO: Auto-generated Javadoc
/**
 * <pre>
 * lotto_create
 *   |_ Lotto.java
 * </pre>
 * 
 * Desc : 로또 번호 생성
 * @Company 	: saeildamil
 * @author  	: MinSu Kim
 * @Date  		: 2012. 9. 10. 오후 10:38:56
 * @version  	: 1.0.0
 */
public class Lotto {
	
	/** The lotto. */
	private boolean[] lotto;	
	
	/** The arr size. */
	private int arrSize;
	
	/** The num size. */
	private int numSize;
	
	/**
	 * Desc : Constructor of Lotto.java class
	 * @param arrSize 로또번호 생성사이즈 45
	 * @param numSize 번호 생성 횟수
	 */

	public Lotto(int arrSize, int numSize) {
		this.arrSize = arrSize;
		this.numSize = numSize;
		this.lotto = new boolean[this.arrSize];
		initLotto();
	}
	
	/**
	 * Desc	: 로또 번호 배열 초기화.
	 *
	 * @Method Name  	: initLotto
	 */
	
	public void initLotto(){
		for(int i=0; i<arrSize; i++){
			lotto[i] = false;
		}
	}
	
	/**
	 * 로또 번호 생성.
	 *
	 * @Method Name  	: createNum
	 * @Method Comment  : 로또 번호 생성
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
	 *
	 * @Method Name  	: prnLotto
	 * @Method Comment  :
	 */
	
	public void prnLotto(){
		for(int i=0; i<arrSize; i++){
			if (lotto[i]) System.out.print(i+1 +"\t");
		}
		System.out.println();
	}

	/**
	 * 번호생성 메소드.
	 *
	 * @Method Name  	: lottoFactory
	 * @Method Comment  :
	 */
	
	public void lottoFactory(){
		for(int i=0; i<numSize; i++){
			createNum();
		}
		prnLotto();
		initLotto();
	}

}
