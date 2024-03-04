package t3_exam;

import java.util.Scanner;

// 최대/최소값 구하기 (두자리 이하의 정수가 입력된다.) - 입력받은 데이터를 모두 출력하시오.
// 단, 모든 숫자를 다 입력받은 후에 최대값과 최소값을 구하시오.
public class Test1_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = -99, min = 99, su, cnt = 0;
		int[] arr = new int[200]; //배열의 단점: 배열은 사용하지 않더라도 크기를 잡아놔야 함
		
		//입력부
		while(true) {
			System.out.print("정수를 입력하세요? (종료:999) ");
			su = sc.nextInt();
			if(su == 999) break;
			
			arr[cnt] = su; // cnt의 초기값은0.
			               // 첫번째 입력받은 수를 배열의 0번지에 저장 후 cnt증가해서 다시 올라감.
			               // 올라가서 두번째 입력받은 수 배열 1번지에 저장
			cnt++;
		}
		
		for(int i=0; i<cnt; i++) {
			if(arr[i] > max) max = arr[i];
			if(arr[i] < min) min = arr[i];
		}
		
		//입력받은 수를 차례대로 출력하시오
		for(int i=0; i<cnt; i++) {
			System.out.print(arr[i] + " / ");
		}
		
		System.out.println();
		System.out.println("최대값 : " + max + " , 최소값 : " + min);
		
		sc.close();
	}
}
