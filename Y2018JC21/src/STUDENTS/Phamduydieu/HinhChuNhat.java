package Phamduydieu;

import java.util.Scanner;

public class HinhChuNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Đề Bài: Nhập 2 cạnh của hình chữ nhật
		 * Tính Chu Vi và Diện Tích Hình Chữ Nhật */
		 int a;
		 int b;
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Nhập giá trị chiều rộng hình chữ nhật:");
		 a = scan.nextInt();
		 System.out.println("Nhập giá trị chiều dài hình chữ nhật:");
		 b = scan.nextInt();
		 System.out.println("Chu vi hình chữ nhật là   : " + 2*(a + b));
		 System.out.println("Diện tích hình chữ nhật là: " + a*b);
	}

}
