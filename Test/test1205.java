package my.test.study;

public class text1205 {

	public static void main(String[] args) {

		int headcount = 8;
		int fee = 2000;
		int DCfee= fee * 9/10;

		if(headcount >= 8) { // 8명이상일시 단체할인
			System.out.println("((8명 이상이므로 단체할인 10% 적용))");
			System.out.println("단체할인 1인당 " + DCfee + "원씩 " + headcount + "명이므로");
			System.out.println("전체 이용 요금은 " + headcount * DCfee + "원 입니다. (10% 할인적용)");
		}

		else {
			System.out.println("1인당 " + fee + "원씩 " + headcount + "명이므로");
			System.out.println("전체 이용 요금은 " + headcount * fee + "원 입니다.");
		}


		String text01 = "한분씩 입장 도와드리겠습니다. ";
		String text02 = "입장권을 보여주세요.";
		String text03 = "전원 입장 완료했습니다.";

		//String result = text01.concat(text02); // 1) concat 텍스트 붙히기
		//System.out.println(result);

		//String result = text01 + text02; //2) + 연산자 이용
		//System.out.println(result);

		System.out.println(text01 + text02); // 3) 제일 간단

		int i = 1;
		while (headcount > i - 1) { //false 가 되면 끝남
			System.out.println( i + "번째 손님 입장.");
			i++;
		}
		System.out.println(text03);

	}
}

