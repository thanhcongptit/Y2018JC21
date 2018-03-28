package STUDENTS.Tien.B5;

import java.util.Scanner;

public class Main {
	// đóng gói
	
	private String tensp;
	private double dongia;
	private double giamgia;
	public String getTensp() {
		return tensp;
	}
	public void setTensp(String tensp) {
		this.tensp = tensp;
	}
	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	public double getGiamgia() {
		return giamgia;
	}
	public void setGiamgia(double giamgia) {
		this.giamgia = giamgia;
	}
	// tạo hàm constructor
	public Main(String tensp, double dongia, double giamgia) {
		super();
		this.tensp = tensp;
		this.dongia = dongia;
		this.giamgia = giamgia;
	}
	// tạo hàm constructor
   public Main() {}
   // nhap du liệu sản phẩm từ bàn phím
   public void nhapdulieu() {
	   Scanner nhap =new Scanner(System.in);
	   System.out.print("ten san pham : ");
	   tensp=nhap.nextLine();
	   System.out.print("donn gia  : ");
	   dongia=nhap.nextDouble();
	   System.out.print("giam gia : ");
	   giamgia=nhap.nextDouble();
	   double thuenk=(dongia-giamgia)*10/100;
	   System.out.println("thue nhap khau: "+ thuenk);
	   System.out.println("             ");
	   System.out.println("             ");
	  nhap.close();
   }
}
