package lpr2_4;

import java.util.Scanner;

public class lpr_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a, b, c;
//		//������ ��� � �� ����� ����� �����
//		// ��� ��������� � ���������
//
//		Scanner in = new Scanner(System.in);
//		System.out.println("a=");
//		a = in.nextInt();
//		System.out.println("b=");
//		b = in.nextInt();
//		System.out.println("c=");
//		c = in.nextInt();
//
//		int max, min;
//		max = (a > b) ? a : b; // ���� �>� ��� ���=�, ����� ���=b
//		if ((a > b) && (a > c)) {
//			max = a;
//		} else if ((b > a) && (b > c)) {
//			max = b;
//		} else {
//			max = c;
//		}
//		System.out.println("max="+max);
//		
//		min = (a < b) ? a : b; // ���� �<� ��� min=�, ����� min=b
//		if ((a < b) && (a < c)) {
//			min = a;
//		} else if ((b < a) && (b < c)) {
//			min = b;
//		} else {
//			min = c;
//		}
//		System.out.println("min="+min);
//		//******************
		
		//���������� ��?
		int a;
		Scanner in = new Scanner(System.in);
		System.out.println("������ ��:");
		a = in.nextInt();
		if (a%4==0) {
			System.out.println("��� �� ����������");	
		}
		else {
			System.out.println("��� �� �� ����������");
		}
			
	}

	
}
