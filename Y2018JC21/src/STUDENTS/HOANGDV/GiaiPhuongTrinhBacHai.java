package HOANGDV;

import java.util.Scanner;

public class GiaiPhuongTrinhBacHai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Nhap a ");
		int a = scan.nextInt();
		System.out.println("Nhap b ");
		int b = scan.nextInt();
		System.out.println("Nhap c ");
		int c = scan.nextInt();

		if (a == 0) {
			System.out.println("PT bac mot");
		} else {
			int dt = b * b - 4 * a * c;
			if (dt < 0) {
				System.out.println("PT vo nghiem");
			} else if (dt == 0) {
				System.out.println("PT co nghiem kep");
				System.out.println("x=" + (-b / 2 * a));
			} else {
				System.out.println("PT co nghiem phan biet");
				System.out.println("x1 = " + ((-b + Math.sqrt(dt)) / (2 * a)));
				System.out.println("x2 = " + ((-b - Math.sqrt(dt)) / (2 * a)));
			}
		}
	}

}
