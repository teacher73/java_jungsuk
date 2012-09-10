package lotto_create;

import java.util.Random;

/**
 * 프로그램 설명
 * @FileName	: Lotto.java
 * @Date  		: 2012. 9. 10.
 * @version  	: 1.0.0
 * @author  	: MinSu Kim
 * @Comment  	: Lotto번호 생성
 */
public class Lotto {
	private boolean[] lotto;	
	private int arrSize;
	private int numSize;
	
	public Lotto(int arrSize, int numSize) {
		this.arrSize = arrSize;
		this.numSize = numSize;
		this.lotto = new boolean[this.arrSize];
		initLotto();
	}
	
	public void initLotto(){
		for(int i=0; i<arrSize; i++){
			lotto[i] = false;
		}
	}
	
	public void CreateNum(){
		Random random = new Random();
		int num = random.nextInt(arrSize);
		if (!lotto[num]){
			lotto[num]=true;
		}else{
			CreateNum();
		}
	}
	
	public void prnLotto(){
		for(int i=0; i<arrSize; i++){
			if (lotto[i]) System.out.print(i+1 +"\t");
		}
		System.out.println();
	}
	
	public void lottoC(){
		for(int i=0; i<numSize; i++){
			CreateNum();
		}
	}

}
