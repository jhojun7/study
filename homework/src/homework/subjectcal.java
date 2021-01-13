package homework;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Subjectcal {

	Subjectcal() throws Exception {
		main();
	}

	public static void main(String[] args) throws Exception {
		new Subjectcal();
	}

	private void main() throws Exception {
		FileUtl fileUtil = new FileUtl();

		List<String> fileContents = fileUtil.readFile("C:\\Users\\jhoju\\Documents\\git\\subject_master.tsv");

		if (fileContents.size() != 1) {
			throw new Exception("과목정보파일정의가 이상합니다.");
		}

		String gradeFiePath = "C:\\Temp\\grade.tsv";

		try {
			List<String> gradeList = fileUtil.readFile(gradeFiePath);
		} catch (FileNotFoundException e) {
			System.out.println(gradeFiePath + "파일이 존재하지 않습니다. 새로작성합니다.");
		}

		List<String> subjectList = Arrays.asList(fileContents.get(0).split("\t"));

		Map<String, Map<String, String>> subjectMap = new HashMap<String, Map<String, String>>();

		int count = subjectList.size();

		Scanner s = new Scanner(System.in);

		boolean isExit = true;
		while(isExit) {
			System.out.print("학생이름을 입력하세요(/q: 입력종료) : ");
			String name = s.next();

			if(name.equals("/q")) {
				isExit = false;
			} else {
				Map<String, String> map = new HashMap<String, String>();
				for (int i = 0; i < count; i++) {
					System.out.print(subjectList.get(i) + "점수를 입력하세요 : ");
					String grade = s.next();

					if(!isNumber(grade)) {
						i--;
						continue;
					}

					map.put(subjectList.get(i), grade);
				}
				subjectMap.put(name, map);
			}
		}

		for (String k1 : subjectMap.keySet()) {
			Map<String, String> map = subjectMap.get(k1);
			int total = 0;
			for (String k2 : map.keySet()) {
				total += Integer.parseInt(map.get(k2));
			}

			map.put("total", total + "");
			map.put("average", (total / count) + "");
			map.put("grade", getGrade(total / count));
		}

		StringBuilder sb = new StringBuilder();
		sb.append("이름");
		sb.append("\t");
		sb.append(fileContents.get(0));
		sb.append("\t");
		sb.append("학점");
		sb.append("\t");
		sb.append("평균");

		sb.append("\r\n");

		for (String k1 : subjectMap.keySet()) {
			Map<String, String> map = subjectMap.get(k1);

			sb.append(k1);
			sb.append("\t");

			for (int i = 0; i < count; i++) {
				String subjectName = subjectList.get(i);
				sb.append(map.get(subjectName));
				sb.append("\t");
			}
			sb.append(map.get("grade"));
			sb.append("\t");

			sb.append(map.get("average"));
			sb.append("\r\n");
		}


		System.out.println(sb.toString());
	}

	private boolean isNumber(String grade) {
		int num = 0;

		try {
			num = Integer.parseInt(grade);
		} catch (Exception e) {
			System.out.println("성적은 숫자로 입력해주세요.");
			return false;
		}

		try {
			if(num < 0 || num > 100) {
				throw new Exception();
			}

		} catch (Exception e) {
			System.out.println("성적은 0 ~ 100점까지의 숫자로 입력해주세요");
			return false;
		}

		return true;
	}

	private String getGrade(int number) {

		// 90 ~ 100
		if(number >= 90) {
			return "A";
		} else if(number >= 80) {
			return "B";
		} else {
			return "F";
		}
	}
}