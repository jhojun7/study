package my.test.study;

import java.math.BigDecimal;

public class Test1 {

	public static void main(String[] args) {

		int widthRec = 10;
		int heigthRec = 20;



		System.out.println("width ;" + widthRec);
		System.out.println("height ;" + heigthRec);
		System.out.println("면적 ;" + heigthRec * widthRec);

		char c = 'a';
		String s ="This is String";

		System.out.println(s);
		System.out.println(c);

		BigDecimal big = new BigDecimal(0);
		big.abs();



		System.out.println(big);

	}
}
