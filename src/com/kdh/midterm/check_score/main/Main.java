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

		String ch = ""; 	// while �� ����
		
		Sub s = new Sub();
		Pro p = new Pro();
		Hap h = new Hap();
		
		while(true) {
			System.out.printf("\n %s \n", JUL);
			System.out.println("  1 : ä��");
			System.out.println("  2 : ����ó��");
			System.out.println("  3 : ���� �� ���ϱ�");
			System.out.println("  4 : �Ұ�");
			System.out.println("  5 : �� ��");
			System.out.printf(" %s \n", JUL);
			
			System.out.printf("  �Է� : ");
			ch = sc.next();			// ������������������������������������ ���� �ֱ�
			
			if(ch.equals("1")) {	// ������������������������������������ ���ڿ� ��
				s.t_kor_check();		// kor_check�� �л� ���� �Ѱ��ְ� ���� �迭���� �ٽ� �Ѱܹ���
			} else if(ch.equals("2")) {
				p.t_pro();
			} else if(ch.equals("3")) {
				h.t_hap();
			} else if(ch.equals("4")) {
			
			} else if(ch.equals("5")){
				System.out.println(" ���α׷��� �����մϴ�.");
				break;
			} else {
				continue;
			}
		} // while��
		sc.close();		// ��ĳ�� ����
	} // Main

	

}
