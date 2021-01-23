package homework;

public class eight {

	public static void main(String[] args) {
		int eight = 0;
		StringBuffer Save = new StringBuffer(); // StringBuffer : 문자열 추가가능 (append)
		for (int i = 1; i < 10001; i++) {
			Save.append(Integer.toString(i));
		}
		String[] num = Save.toString().split(""); // 문자마다 조각 조각 내서 리스트
		for (int i = 0; i < num.length; i++) {
			if(num[i].equals("8")) eight++; // 8 이라는 글자마다 int eight +1
		}
		System.out.println(eight);
	}
}////// for문 하나로 범위만들기
