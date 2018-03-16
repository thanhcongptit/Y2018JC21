package MaiAnh.Note;

import java.util.Scanner;

public class PhuongTrinhB2 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Nhap cac he so cua phuong trinh bac 2 a*x^2 + b*x +c =0");
		System.out.println("Nhap a: ");
		int a = sn.nextInt();
		System.out.println("Nhap b: ");
		int b = sn.nextInt();
		System.out.println("Nhap c: ");
		int c = sn.nextInt();
		if(a==0){
			System.out.println("Phuong trinh tren la phuong trinh bac 1" );
		}else{
			int delta = b*b-4*a*c;
			if(delta<0){
				System.out.println("Phuong trinh vo nghiem");
			}else{
				if(delta==0){
					System.out.println("Phuong trinh co nghiem kep: " + (-b/(2*a)));
				}else{
					System.out.println("Phuong trinh co nghiem: ");
					System.out.println("x1 = " + ((-b + Math.sqrt(delta))/2));
					System.out.println("x2 = " + ((-b - Math.sqrt(delta))/2));
				}
			}
		}
	}

}
