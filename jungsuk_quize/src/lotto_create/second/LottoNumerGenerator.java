/**
 *
 * @package		: lotto_create.second
 * @FileName	: LottoNumerGenerator.java
 * @Date  		: 2013. 2. 3.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package lotto_create.second;

import java.util.HashSet;
import java.util.Random;


/**
 * 로또 넘버 생성
 * @author	mskim
 * @since	2013. 2. 3. 오후 1:59:52
 * @version	1.0.0
 */

public class LottoNumerGenerator {
	private int lottoSize;
	private HashSet<Integer> lottoNum;
	
	public LottoNumerGenerator(int lottoSize) {
		this.lottoSize = lottoSize;
		lottoNum = new HashSet<>(lottoSize);
		numGenerator();
	}
	
	boolean add(){
		return lottoNum.add(new Random().nextInt(45)+1)?true:add();
	}

	void numGenerator(){
		for(int i=0; i<lottoSize; i++){
			add();
		}
	}

	public HashSet<Integer> getLottoNum() {
		return lottoNum;
	}	
	
}