package com.kdh.midterm.check_score.utils;
import java.util.Scanner;

public class Hap {
	
	public void t_hap() {
		Scanner sc = new Scanner(System.in);
		String Jul = "─────────────────────────────────────────";
		
		int x = 0;
		int y = 0;
		// 짝수(even) 합
		int e_hap = 0;
		// 홀수(odd) 합
		int o_hap = 0;
		
		/** (NEW) 홀짝 합을 담을 배열
		 * [0]: 짝수 합
		 * [1]: 홀수 합
		 */
		int[] eo_hap = new int[2];
 		
		System.out.print("X(시작값)를 입력하세요 :");
		x = sc.nextInt();
		System.out.print("Y(끝값)를 입력하세요 :");
		y = sc.nextInt();
		
		// NEW:
		if(x > y) {
			// SWAP X, Y
			int temp = x;
			x = y;
			y = temp;
		}
		
		for(int i=x; i<y+1;i++) {
			// Method 1: e_hap, o_hap이 분리된 변수인 경우
			// 분기를 줄이는 코드(실제 최적화 후 성능상 유리한지는 반드시 측정 필요함.)
			boolean isEven = i % 2 == 0;
			e_hap += isEven ? i : 0;
			o_hap += !isEven ? i : 0;
			
			// Method 2: 비트연산 AND
			// 가장 오른쪽 비트를 읽는 법(값 & 1)(값 & 0b0001)
			// 오른쪽에서 두 번째 비트를 읽는 법(값 & 2)(값 & 0b0010)
			// 오른쪽에서 첫 번째 비트와 두 번쨰 비트를 읽는 법(값 & 3)(값 & 0b0011)
			// 오른쪽에서 세 번째 비트를 읽는 법(값 & 4)(값 & 0b0100)
			// 가장 오른쪽 비트는 홀수일 때 1, 짝수일 때 0.
			eo_hap[i & 1] += i;
			// eo_hap[0] += i;
			// eo_hap[1] += i;
		} 
		
		// 출력
		System.out.printf("\n %s \n", Jul);
		System.out.printf("  %d 부터 %d까지 홀수의 합은 : %d입니다.\n",x,y,o_hap);
		System.out.printf("  %d 부터 %d까지 짝수의 합은 : %d입니다.\n",x,y,e_hap);
		System.out.printf(" %s \n", Jul);
	}
}