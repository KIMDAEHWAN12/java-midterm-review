// �߰����

package com.kdh.midterm.check_score.main;
import java.util.Scanner;

import com.kdh.midterm.check_score.utils.Hap;
import com.kdh.midterm.check_score.utils.Pro;
import com.kdh.midterm.check_score.utils.Sub;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String JUL = "����������������������������������������������������������������������������������";

		int sel = 0; 	// while �� ����
		
		Sub s = new Sub();
		Pro p = new Pro();
		Hap h = new Hap();
		
		// goto -> X
		mainloop: while(true) {
			System.out.printf("\n %s \n", JUL);
			System.out.println("  1 : ä��");
			System.out.println("  2 : ����ó��");
			System.out.println("  3 : ���� �� ���ϱ�");
			System.out.println("  4 : �Ұ�");
			System.out.println("  5 : �� ��");
			System.out.printf(" %s \n", JUL);
			
			System.out.printf("  �Է� : ");
			sel = sc.nextInt();			// ������������������������������������ ���� �ֱ�
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
				System.out.println(" ���α׷��� �����մϴ�.");
				// // Method 1:
				// System.exit(0);
				break mainloop; // label
			default:
				continue mainloop;
			}
		} // while��
		sc.close();		// ��ĳ�� ����
	} // Main

	

}
