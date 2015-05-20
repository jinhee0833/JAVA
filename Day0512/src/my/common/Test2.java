package my.common;

import java.util.Calendar;

public class Test2 {

	public static void main(String[] args) {
		String jumin = "9012301234567";
		Calendar now = Calendar.getInstance();
		int yy = now.get(now.YEAR);
		char gender = jumin.charAt(6);
		int myy = Integer.parseInt(jumin.substring(0, 2));
		int age = 0;
		switch (gender) {
		case '1':
		case '2':
			age = yy - (1900 + myy) + 1;
			break;
		case '3':
		case '4':
			age = yy - (2000 + myy) + 1;
			break;
		}

		System.out.println("나이: " + age);
		
		int code =Character.getNumericValue(gender)%2;
		switch(code){
		case 0:	System.out.println("여자");break;
		case 1:	System.out.println("남자");	break;
		}

	}

}
