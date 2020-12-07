package my.test.study;

public class study1205_for { //for문 : 거짓이 되면 종류, 참일때만 돌린다.

	public static void main(String[] args) {
		String[] strArr = new String[3]; // 5개의 배열 선언 (엑셀칸으로 5칸잡는다고 생각하면됨)
		strArr[0] = "aa"; // 0번째 번지에 aa 집어넣기
		strArr[1] = "bb";
		strArr[2] = "cc";
		//System.out.println(strArr.length);

		for(int i = 0; i < strArr.length; i++) { 	// 무조건 외우기 , 10번 반복하는거
													// i 에대한 초기값 설정, 종료조건, i를 1씩 늘려줌
			System.out.println(strArr[i]);
		}
	}
}
