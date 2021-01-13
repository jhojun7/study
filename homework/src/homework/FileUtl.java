package homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtl {
	public List<String> readFile(String path) throws Exception {
		List<String> fileContentList = null;
		try {
			File file = new File(path);

			//줄단위로 읽기
			BufferedReader br =  new BufferedReader(new FileReader(file));
			String str = "";
			
			fileContentList = new ArrayList<String>();

			while((str = br.readLine()) != null){
				fileContentList.add(str);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println(path + "를 찾을수없습니다.");
			throw e;
		} catch (IOException e) {
			System.out.println(path + "파일을 읽을수없습니다.");
			throw e;
		} catch (Exception e) {
			System.out.println("에러가 발생하였습니다.");
			throw e;
		} 
        
        return fileContentList;
	}

}
