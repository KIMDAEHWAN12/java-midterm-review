package com.kdh.midterm.check_score.utils;

import java.util.Scanner;

public class Sub {
	
	public void t_kor_check() {
		
		Scanner sc = new Scanner(System.in);
		final int n; // const 상수
		
		System.out.print("학생 수 : ");
		n = sc.nextInt(); // 첫 대입 값이 고정됨(C언어와 달리 선언 동시에 초기화하지 않아도 됨.)
		
		// Subject Answers
		int[][] sub_dap = new int[3][10]; // 0 initialized(0d, '\0', false, ...)
		
		// Student Answers
		int[][] stu_dap = new int[3][10];
	
		// 3 kinds of state: int[][]
		int[][] stu_ox = new int[3][n]; // CUMSUM
		
		int o = 0;	// 정답 갯수
		String Jul = "─────────────────────────────────────────";
		
		// 과목별 정답지
		System.out.printf("\n %s \n", Jul);
		// Array Dim ==> For 중첩 수
		// 2차원 배열 ==> 2중 for문을 쓰는 경우가 많다.
		for(int i = 0;i < 3; i++) {
			// sprintf => String.format("", ...)
			// printf => System.out.printf("", ...) 
			System.out.printf(" 과목 %d ", i + 1);
			for(int j = 0; j < 10; j++) {
				/*
				 * Math.random() -> 0(inclusive)~1(exclusive) 0 이상 1 미만
				 * Math.random() * 4 -> 0 이상 4 미만
				 * 거기에 + 1 -> 1 이상 5 미만(1~4.999...)
				 * (int)(그 값)으로 형 변환(캐스팅) -> 1, 2, 3, 4 중에 나옴.
				 */
				sub_dap[i][j] = (int)(Math.random()*4+1);
				System.out.printf("%2d ", sub_dap[i][j]);
			}
		}
		
		System.out.printf("\n %s\n", Jul);
		// 학생 N명
		for(int j=0;j<n;j++) {
			
			// 학생 제출 답 저장
			for(int i=0;i<10;i++) {
				stu_dap1[i] = (int)(Math.random()*4+1);
				stu_dap2[i] = (int)(Math.random()*4+1);
				stu_dap3[i] = (int)(Math.random()*4+1);
			}
			
			// 시험
			System.out.printf("\n %s\n", Jul);
			System.out.printf(" 학생%d \n", j+1);
			o = 0; 	// 맞은 갯수 초기화
			System.out.printf(" 과목1 ");
			for(int i=0;i<10;i++) {
				if(sub_dap1[i] == stu_dap1[i]) {
					o++;
					System.out.print(" O ");
				} else {
					System.out.print(" X ");
				}
				stu_ox1[j] = o*10;
			}	
			System.out.printf(" %3d점 ", stu_ox1[j]);
			
			o = 0; 	// 맞은 갯수 초기화
			System.out.printf("\n 과목2 ");
			for(int i=0;i<10;i++) {
				if(sub_dap2[i] == stu_dap2[i]) {
					o++;
					System.out.print(" O ");
				} else {
					System.out.print(" X ");
				}
				stu_ox2[j] = o*10;
			}	
			System.out.printf(" %3d점 ", stu_ox2[j]);
			
			o = 0; 	// 맞은 갯수 초기화
			System.out.printf("\n 과목3 ");
			for(int i=0;i<10;i++) {
				if(sub_dap3[i] == stu_dap3[i]) {
					o++;
					System.out.print(" O ");
				} else {
					System.out.print(" X ");
				}
				stu_ox3[j] = o*10;
			}	
			System.out.printf(" %3d점 ", stu_ox3[j]);

		} // 학생 N명 for
		System.out.printf("\n %s\n", Jul);
		System.out.println(" 성명  과목1  과목2  과목3");
		System.out.printf(" %s\n", Jul);
		for(int i=0;i<n;i++) {
			System.out.printf(" 학생%d %3d   %3d   %3d\n", i+1, stu_ox1[i], stu_ox2[i], stu_ox3[i]);
		}	
		System.out.printf(" %s\n", Jul);
	}	// kor_check
}
