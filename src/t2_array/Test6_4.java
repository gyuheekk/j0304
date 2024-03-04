package t2_array;

import java.util.Date;
import java.util.Scanner;

public class Test6_4 {
	public static void main(String[] args) {
		Date now = new Date();

		System.out.println("now : " + now);
		
		Scanner sc = new Scanner(System.in);
		String yn = "";
		
		System.out.print("계속할까요? (Yes/No) ");
		yn = sc.next();
		System.out.println("입력된 문자 : " + yn);
		
		for(int i=0; i<yn.length(); i++) {
			if(yn.charAt(i) == 'Y') System.out.println("입력된 문자중 Y가 있어용*^^*."); // 차at는 정수타입. 문자라면 equals로 비교해야 함
			else System.out.println("입력된 문자중 Y가 없어요 ㅠㅠ");
		}
		
		sc.close();
	}
}