package homework;

import java.util.Scanner;					 // Scanner 임포트

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // scanner 기능 생성
		int N = scan.nextInt();				// 정수 N 입력

		long[] arr = new long[100];			// 100 크기의 arr 배열 // 숫자가 커서 long으로

		arr[0] = 1;							// 0번째 배열값 1 고정
		arr[1] = 1;							// 1번째 배열값 1 고정

		for (int i=2; i<100; i++){			// 2번째 배열부터 99번째 배열까지는 앞 두배열값 더한값
			arr[i] = arr[i-1] + arr[i-2];				// 0부터 99배열까지 수 입력 완료
		}

		for (int i=0; i<N; i++) {			// i는 0번째부터 N-1배열, (N번째까지)
			System.out.print(arr[i]+" ");
		}

		scan.close();						// 스캔 종료

	}

}

// BigDecimal