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
 		
		System.out.print("X(시작값)를 입력하세요 :");
		x = sc.nextInt();
		System.out.print("Y(끝값)를 입력하세요 :");
		y = sc.nextInt();
		
		// OLD:
//		if(x > y) {
//			for(int i=y; i<x+1;i++) {
//				if(i%2==0) {
//					e_hap += i;
//				} else {
//					o_hap += i;
//				}
//			} 
//		} else {
//			for(int i=x; i<y+1;i++) {
//				if(i%2==0) {
//					e_hap += i;
//				} else {
//					o_hap += i;
//				}
//			} 
//		}
		// NEW:
		if(x > y) {
			// SWAP X, Y
			int temp = x;
			x = y;
			y = temp;
		}
		
		for(int i=x; i<y+1;i++) {
			if(i%2==0) {
				e_hap += i;
			} else {
				o_hap += i;
			}
		} 
		
		// 출력
		System.out.printf("\n %s \n", Jul);
		System.out.printf("  %d 부터 %d까지 홀수의 합은 : %d입니다.\n",x,y,o_hap);
		System.out.printf("  %d 부터 %d까지 짝수의 합은 : %d입니다.\n",x,y,e_hap);
		System.out.printf(" %s \n", Jul);
	}
}