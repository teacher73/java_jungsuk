/**
 *
 * @package		: lotto_create.second
 * @FileName	: LottoNum.java
 * @Date  		: 2013. 2. 3.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package lotto_create.second;

import java.util.ArrayList;

/**
 * 
 * @author	mskim
 * @since	2013. 2. 3. 오후 3:14:35
 * @version	1.0.0
 */

public class LottoNum {
	private ArrayList<LottoNumerGenerator> list;
	private int count;
	
	public LottoNum(int count) {
		this.count = count;
		list = new ArrayList<>(count);
		lottoCreate();
	}
	
	void lottoCreate(){
		for(int i=0; i<count; i++)
			list.add(new LottoNumerGenerator(6));
	}
	
	void prnLottoList(){
		for(LottoNumerGenerator lotto: list){
			for(Integer a: lotto.getLottoNum())
				System.out.print(a + "\t");
			System.out.println();
		}
	}

	public ArrayList<LottoNumerGenerator> getList() {
		return list;
	}

	public static void main(String[] args) {
		new LottoNum(5).prnLottoList();
	}//end of main
	
}
