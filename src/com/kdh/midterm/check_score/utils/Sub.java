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
		int[][] stu_dap = new int[3][10];
	
		// 3 kinds of state: int[][]
		int[][] stu_ox = new int[3][n]; // CUMSUM
		
		int o = 0;	// ���� ����
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
		for(int j=0;j<n;j++) {
			
			// �л� ���� �� ����
			for(int i=0;i<10;i++) {
				stu_dap1[i] = (int)(Math.random()*4+1);
				stu_dap2[i] = (int)(Math.random()*4+1);
				stu_dap3[i] = (int)(Math.random()*4+1);
			}
			
			// ����
			System.out.printf("\n %s\n", Jul);
			System.out.printf(" �л�%d \n", j+1);
			o = 0; 	// ���� ���� �ʱ�ȭ
			System.out.printf(" ����1 ");
			for(int i=0;i<10;i++) {
				if(sub_dap1[i] == stu_dap1[i]) {
					o++;
					System.out.print(" O ");
				} else {
					System.out.print(" X ");
				}
				stu_ox1[j] = o*10;
			}	
			System.out.printf(" %3d�� ", stu_ox1[j]);
			
			o = 0; 	// ���� ���� �ʱ�ȭ
			System.out.printf("\n ����2 ");
			for(int i=0;i<10;i++) {
				if(sub_dap2[i] == stu_dap2[i]) {
					o++;
					System.out.print(" O ");
				} else {
					System.out.print(" X ");
				}
				stu_ox2[j] = o*10;
			}	
			System.out.printf(" %3d�� ", stu_ox2[j]);
			
			o = 0; 	// ���� ���� �ʱ�ȭ
			System.out.printf("\n ����3 ");
			for(int i=0;i<10;i++) {
				if(sub_dap3[i] == stu_dap3[i]) {
					o++;
					System.out.print(" O ");
				} else {
					System.out.print(" X ");
				}
				stu_ox3[j] = o*10;
			}	
			System.out.printf(" %3d�� ", stu_ox3[j]);

		} // �л� N�� for
		System.out.printf("\n %s\n", Jul);
		System.out.println(" ����  ����1  ����2  ����3");
		System.out.printf(" %s\n", Jul);
		for(int i=0;i<n;i++) {
			System.out.printf(" �л�%d %3d   %3d   %3d\n", i+1, stu_ox1[i], stu_ox2[i], stu_ox3[i]);
		}	
		System.out.printf(" %s\n", Jul);
	}	// kor_check
}
