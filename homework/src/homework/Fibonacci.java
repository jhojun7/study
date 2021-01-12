package homework;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;					 // Scanner 임포트

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // scanner 기능 생성
		int N = scan.nextInt();				// 정수 N 입력

		if (N == 1) {
			System.out.print("1");
		} else if (N > 1 && N <= 100){
			List<BigDecimal> arr = new ArrayList<BigDecimal>();			// List<BigDecimal> 형태로 변경

			arr.add(0, new BigDecimal(1));							// 0번째 리스트값 1 고정
			arr.add(1, new BigDecimal(1));						// 1번째 리스트값 1 고정

			for (int i = 2; i < N; i++){			// 2번째 배열부터 N번째 . 앞 두배열값 더한값
				BigDecimal y = arr.get(i-1);
				BigDecimal z = arr.get(i-2);
				BigDecimal x = y.add(z);
				arr.add(x);							// 리스트에 x값(i번째까지) 추가
			}
			System.out.print(arr);
		} else {
			System.out.print("1부터 100까지의 자연수를 입력해주세요.");			// 예외처리
		}
		scan.close();

	}
}