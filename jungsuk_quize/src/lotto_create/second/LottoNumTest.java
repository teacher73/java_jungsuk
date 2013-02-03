/**
 *
 * @package		: lotto_create.second
 * @FileName	: LottoNumTest.java
 * @Date  		: 2013. 2. 3.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package lotto_create.second;


import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * 
 * @author	mskim
 * @since	2013. 2. 3. 오후 3:39:26
 * @version	1.0.0
 */

public class LottoNumTest extends TestCase {
	LottoNum lotto;
	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		lotto = new LottoNum(5);
	}

	@Test
	public void test() {
		lotto = new LottoNum(5);
		for(int i=0; i<lotto.getList().size();i++)
			Assert.assertEquals(6, lotto.getList().get(i).getLottoNum().size());
	}

	public void testCount()  {
		for(int i=0; i<100; i++){
			test();
		}
	}
	


	public static void main(String[] args) {
		junit.textui.TestRunner.run(new TestSuite(LottoNumTest.class));
	}//end of main

}
