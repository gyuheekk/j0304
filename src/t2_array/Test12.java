package t2_array;

// 배열의 복사(깊은 복사, 얕은 복사)
public class Test12 {
	public static void main(String[] args) {
		int[] su1 = {1,2,3,4,5,6};
		// int[] su2 = new int[5];
		int[] su2 = new int[su1.length];
		int[] su3 = new int[su1.length];
		
		System.out.println("su1배열 : ");
		for(int i=0; i<su1.length; i++) {
			System.out.print(su1[i] + " ");
		}
		System.out.println("\n");
		
		System.out.println("su2배열 : ");
		for(int i=0; i<su2.length; i++) {
			System.out.print(su2[i] + " ");
		}
		System.out.println("\n");
		
		// 배열복사 (깊은 복사) 내용을 완전히 복사한 것
		for(int i=0; i<su1.length; i++) {
			su2[i] = su1[i];
		}
		
		System.out.println("su2배열 : ");
		for(int i=0; i<su2.length; i++) {
			System.out.print(su2[i] + " ");
		}
		System.out.println("\n");
		
		// 배열복사(얕은 복사) 번지를 넘겼기 때문에 같은 주소를 가리킴
		su3 = su1;
		
		System.out.println("su3배열 : ");
		for(int i=0; i<su2.length; i++) {
			System.out.print(su3[i] + " ");
		}
		System.out.println("\n");
		
		// su1 주소의 값을 변경 후 확인해보자.
		su1[4] = 500;
		System.out.println("su1배열 : ");
		for(int i=0; i<su1.length; i++) {
			System.out.print(su1[i] + " ");
		}
		System.out.println("\n");
		
		System.out.println("su3배열 : ");
		for(int i=0; i<su3.length; i++) {
			System.out.print(su3[i] + " ");
		}
		System.out.println("\n");
		
		System.out.println("su2배열 : ");
		for(int i=0; i<su2.length; i++) {
			System.out.print(su2[i] + " ");
		}
	
		System.out.println("\n");
		
		
	}
}
