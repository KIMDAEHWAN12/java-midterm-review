package com.kdh.midterm.check_score.utils;
import java.util.Scanner;

public class Hap {
	
	public void t_hap() {
		Scanner sc = new Scanner(System.in);
		String Jul = "����������������������������������������������������������������������������������";
		
		int x = 0;
		int y = 0;
		// ¦��(even) ��
		int e_hap = 0;
		// Ȧ��(odd) ��
		int o_hap = 0;
		
		/** (NEW) Ȧ¦ ���� ���� �迭
		 * [0]: ¦�� ��
		 * [1]: Ȧ�� ��
		 */
		int[] eo_hap = new int[2];
 		
		System.out.print("X(���۰�)�� �Է��ϼ��� :");
		x = sc.nextInt();
		System.out.print("Y(����)�� �Է��ϼ��� :");
		y = sc.nextInt();
		
		// NEW:
		if(x > y) {
			// SWAP X, Y
			int temp = x;
			x = y;
			y = temp;
		}
		
		for(int i=x; i<y+1;i++) {
			// Method 1: e_hap, o_hap�� �и��� ������ ���
			// �б⸦ ���̴� �ڵ�(���� ����ȭ �� ���ɻ� ���������� �ݵ�� ���� �ʿ���.)
			boolean isEven = i % 2 == 0;
			e_hap += isEven ? i : 0;
			o_hap += !isEven ? i : 0;
			
			// Method 2: ��Ʈ���� AND
			// ���� ������ ��Ʈ�� �д� ��(�� & 1)(�� & 0b0001)
			// �����ʿ��� �� ��° ��Ʈ�� �д� ��(�� & 2)(�� & 0b0010)
			// �����ʿ��� ù ��° ��Ʈ�� �� ���� ��Ʈ�� �д� ��(�� & 3)(�� & 0b0011)
			// �����ʿ��� �� ��° ��Ʈ�� �д� ��(�� & 4)(�� & 0b0100)
			// ���� ������ ��Ʈ�� Ȧ���� �� 1, ¦���� �� 0.
			eo_hap[i & 1] += i;
			// eo_hap[0] += i;
			// eo_hap[1] += i;
		} 
		
		// ���
		System.out.printf("\n %s \n", Jul);
		System.out.printf("  %d ���� %d���� Ȧ���� ���� : %d�Դϴ�.\n",x,y,o_hap);
		System.out.printf("  %d ���� %d���� ¦���� ���� : %d�Դϴ�.\n",x,y,e_hap);
		System.out.printf(" %s \n", Jul);
	}
}