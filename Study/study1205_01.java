package my.test.study;

import java.util.Scanner;

public class test1205 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 		입력하는거 , Scanner 이대로 외우기
		System.out.print("몇살이니? :");
		String age = scanner.next(); // 					유저입력
		System.out.println("님나이" + age + "살이야");


		int intAge = Integer.parseInt(age); //				공식같이 외워라, 스트링 > 인트 변환공식
		String strAge= Integer.toString(intAge);
		String strAge2 = intAge + "";

		int money = 0; //									 money 변수 설정
		if(intAge >= 10 && intAge <= 20) {
			money =10000;
		}
		else if(intAge >= 21 && intAge <= 30) {
			money = 2000;
		}
		else if(intAge >= 31 && intAge <= 40) {
			money = -10000;
		}
		else {
			System.out.println("세뱃돈 못받는 나이");
			System.exit(0); // 								밑에거를 프린트하지않기 위해 강제종료
		}

		System.out.println("당신의 세뱃돈은 " + money + "원입니다.");
	}
}
