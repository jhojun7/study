package my.test.study;

import java.util.Random;

public class study1205_lotto {

	public static void main(String[] args) {
		int[] lottoNumberArr = new int[5];

		for (int i = 0; i < lottoNumberArr.length; i++) {

			int number = getLottoNumber();
			boolean isDup = false;
			for (int j = 0; j < lottoNumberArr.length; j++) {
				int j2 = lottoNumberArr[j];

				if(j2 == number) {
					isDup= true;
				}
			}


			lottoNumberArr[i] = number;

			if(isDup) {
				i--;
			}
		}

		for (int i = 0; i < lottoNumberArr.length; i++) {
			int lottoNumber = lottoNumberArr[i];

			System.out.println(lottoNumber);
		} //부족부분


	}

	private static int getLottoNumber() {
		Random r = new Random();
		int number = r.nextInt(45); // 0~44까지의 수를 랜덤으로 int 로 뽑아냄
		return number;
	}
}
