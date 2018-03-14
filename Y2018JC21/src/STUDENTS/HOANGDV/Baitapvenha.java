package HOANGDV;
import java.util.Scanner;

public class Baitapvenha {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BaiTap: Tinh Chu vi vs Dien Tich Hinh Chu Nhat\n");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao chieu dai: ");
		double dai = scan.nextDouble();
		System.out.println("Nhap vao chieu rong: ");
		double rong = scan.nextDouble();

		System.out.println("Chieu dai hcn la: " + dai);
		System.out.println("Chieu dai hcn la: " + rong);
		System.out.println("Cu vi hcn la: " + (dai + rong));
		System.out.println("Dien tich hcn la: " + (dai * rong));
		
		scan.close();
	}
}
