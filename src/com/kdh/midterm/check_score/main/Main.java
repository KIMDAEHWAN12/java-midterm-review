// 중간고사

package com.kdh.midterm.check_score.main;
import java.util.Scanner;

import com.kdh.midterm.check_score.utils.Hap;
import com.kdh.midterm.check_score.utils.Pro;
import com.kdh.midterm.check_score.utils.Sub;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String JUL = "─────────────────────────────────────────";

		int sel = 0; 	// while 문 선택
		
		Sub s = new Sub();
		Pro p = new Pro();
		Hap h = new Hap();
		
		// goto -> X
		mainloop: while(true) {
			System.out.printf("\n %s \n", JUL);
			System.out.println("  1 : 채점");
			System.out.println("  2 : 성적처리");
			System.out.println("  3 : 구간 합 구하기");
			System.out.println("  4 : 소감");
			System.out.println("  5 : 종 료");
			System.out.printf(" %s \n", JUL);
			
			System.out.printf("  입력 : ");
			sel = sc.nextInt();			// ────────────────── 문자 넣기
			// nextInt(), nextLine()
			
			// Select
			switch(sel) {
			case 1:
				s.t_kor_check();
				break;
			case 2:
				p.t_pro();
				break;
			case 3:
				h.t_hap();
				break;
			case 4:
				break;
			case 5:
				System.out.println(" 프로그램을 종료합니다.");
				// // Method 1:
				// System.exit(0);
				break mainloop; // label
			default:
				continue mainloop;
			}
		} // while문
		sc.close();		// 스캐너 종료
	} // Main

	

}
