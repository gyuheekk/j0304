package t2_array;

import java.util.Arrays;

public class Test6_2 {
	public static void main(String[] args) {
		char[] strArray = {'K','o','r','e','a'}; //크기 5개
		
		for(int i=0; i<strArray.length; i++) {
			System.out.print(strArray[i]);
		}
		System.out.println();
		
		System.out.println(strArray); 
		System.out.println("===========================");
		
		System.out.println("strArray의 길이 : " + strArray.length);
		System.out.println();
		
		System.out.println("strArray을 문자열로 변환 : " + Arrays.toString(strArray)); // 문자열로 변환
		System.out.println();
		
		for(int i=0; i<strArray.length; i++) {
			System.out.println("strArray["+i+"] = " +strArray[i]);
		}
		System.out.println();
		
		String str = "Korea"; //문자열로 str에 넣음
		//현재 문자열중에서 특정 인텍스에 위치한 문자를 반환? charAt()
		for(int i=0; i<str.length(); i++) { 			//.length() 문자열의 길이를 구하는 메소드
			System.out.println("str("+i+") = " + str.charAt(i));
		}
	}
}