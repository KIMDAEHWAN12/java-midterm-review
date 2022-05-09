package com.kdh.midterm.check_score.utils;

import java.util.Scanner;

public class Sub {
	
	public void t_kor_check() {
		
		Scanner sc = new Scanner(System.in);
		final int n; // const ���
		
		System.out.print("�л� �� : ");
		n = sc.nextInt(); // ù ���� ���� ������(C���� �޸� ���� ���ÿ� �ʱ�ȭ���� �ʾƵ� ��.)
		
		// Subject Answers
		int[][] sub_dap = new int[3][10]; // 0 initialized(0d, '\0', false, ...)
		
		// Student Answers
		int[][][] stu_dap = new int[3][n][10];
	
		// 3 kinds of state: int[][]
		int[][] stu_score = new int[3][n]; // CUMSUM
		
		String Jul = "����������������������������������������������������������������������������������";
		
		// ���� ������
		System.out.printf("\n %s \n", Jul);
		// Array Dim ==> For ��ø ��
		// 2���� �迭 ==> 2�� for���� ���� ��찡 ����.
		for(int i = 0;i < 3; i++) {
			// sprintf => String.format("", ...)
			// printf => System.out.printf("", ...) 
			System.out.printf(" ���� %d ", i + 1);
			for(int j = 0; j < 10; j++) {
				/*
				 * Math.random() -> 0(inclusive)~1(exclusive) 0 �̻� 1 �̸�
				 * Math.random() * 4 -> 0 �̻� 4 �̸�
				 * �ű⿡ + 1 -> 1 �̻� 5 �̸�(1~4.999...)
				 * (int)(�� ��)���� �� ��ȯ(ĳ����) -> 1, 2, 3, 4 �߿� ����.
				 */
				sub_dap[i][j] = (int)(Math.random()*4+1);
				System.out.printf("%2d ", sub_dap[i][j]);
			}
		}
		
		System.out.printf("\n %s\n", Jul);
		
		// �л� N��
		for(int k=0;k<n;k++) {
			
			// (�� �л���) ���� ���
			for(int i = 0;i < 3; i++) {
				for(int j = 0; j < 10; j++) {
					// i: Subject index
					// k: Student index
					// j: Each answers
					stu_dap[i][k][j] = (int)(Math.random()*4+1);
				}
			}
			
			// ����(��)
			System.out.printf("\n %s\n", Jul);
			System.out.printf(" �л�%d \n", k+1);
			for(int i = 0; i < 3; i++) {
				int currentScore = 0;	// ���� ����
				System.out.printf(" ����1 ");
				for(int j = 0; j < 10; j++) {
					if(sub_dap[i][j] == stu_dap[i][k][j]) {
						currentScore += 10; // ������.(���� +=, -=, ...)
						System.out.print(" O ");
					} else {
						System.out.print(" X ");
					}
					stu_score[i][k] = currentScore;
				}
				System.out.printf(" %3d�� ", stu_score[i][k]);
			}// for(i): i as subject index

		} // �л� N�� for
		
		System.out.printf("\n %s\n", Jul);
		System.out.println(" ����  ����1  ����2  ����3");
		System.out.printf(" %s\n", Jul);
		
		for(int k = 0; k < n; k++) {
			System.out.printf(" �л�%d %3d   %3d   %3d\n", k+1, stu_score[k][0], stu_score[k][1], stu_score[k][2]);
		}
		
		System.out.printf(" %s\n", Jul);
	}	// kor_check
}// END::public class
