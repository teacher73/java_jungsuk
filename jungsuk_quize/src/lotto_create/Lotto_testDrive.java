package lotto_create;

public class Lotto_testDrive {

	public static void main(String[] args) {
		Lotto lotto = new Lotto(45, 6);

		for (int i=0; i<10; i++){
			lotto.lottoC();
			lotto.prnLotto();
			lotto.initLotto();
		}
		System.out.println("===========================================");
	}

}
