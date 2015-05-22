package net.hb.day21;

import java.io.File;
import java.io.PrintWriter;

public class Two {

	public static void main(String[] args) {
		String path = "C:/Mtest/zoomskLGkt";
		int dan = 37;
		try {
			File file = new File(path);
			file.mkdir();
			System.out.println(path + " 디렉토리 폴더가 생성됐습니다.");
			PrintWriter pw = new PrintWriter(path+"/gugu.txt");
			
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + "*" + i + "=" + (dan * i));
				pw.println(dan + "*" + i + "=" + (dan * i));

//				pw.write(dan + "*" + i + "=" + (dan * i));
			}
			pw.close();//중요!!!!!
		} catch (Exception ex) {
			System.out.println("error: " + ex.toString());
		}

	}

}
