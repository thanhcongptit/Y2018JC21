package STUDENTS.Tienhm;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class baitapb3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dauvao = new Scanner(System.in);
		
		System.out.println("nhap gia tri a :");
		int a = dauvao.nextInt();
		
		System.out.println("nhap gia tri b :");
		int b = dauvao.nextInt();
		
		System.out.println("nhap gia tri b :");
		int c = dauvao.nextInt();
		
		double dt;
		dt = b * b - 4 * a * c;
		
		double x1;
		x1 = (b + sqrt(dt)) / 2;
		
		double x2;
		x2 = (b - sqrt(dt)) / 2;

		if (a == 0) {
			System.out.println("Phuong trinh co 1 nghiem =" + "-" + c / b);
		} else if (dt < 0) {
			System.out.println("phuong trinh vo nghiem");
		} else if (dt == 0) {
			System.out.println("phuong trinh vo nghiem kep=" + "-" + b / a);
		} else {
			System.out.println("phuong trinh co 2 nghiem phan biet:" + "x1=" + x1 + "," + "x2=" + x2);
		}
		dauvao.close();

	}

	private static int sqrt(double dt) {
		// TODO Auto-generated method stub
		return 0;
	}

}
