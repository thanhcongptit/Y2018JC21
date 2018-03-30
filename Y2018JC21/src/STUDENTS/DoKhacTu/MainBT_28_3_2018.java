package STUDENTS.DoKhacTu;

import java.util.Scanner;

public class MainBT_28_3_2018 {

	public static void main(String[] args) {
		Sach sa= new Sach();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.print("ma tai lieu cua sach la: ");
		sa.setMaTaiLieu(sc1.nextLine());
		System.out.print("so ban phat hanh cua sach la: ");
		sa.setSoBanPhatHanh(sc.nextInt());
		 System.out.print("so trang cua sach la: ");
		sa.setSoTrang(sc.nextInt());
		System.out.print("ten nha san xuat cua sach la: ");
		sa.setTenNhaSx(sc1.nextLine());
		System.out.print("ten tac gia cua sach la: ");
		sa.setTenTacGia(sc1.nextLine());
		
		
		TapChi tc = new TapChi();
		System.out.print("\nma tai lieu cua tap chi la: ");
		tc.setMaTaiLieu(sc1.nextLine());
		System.out.print("so ban phat hanh cua tap chi la: ");
		tc.setSoPhatHanh(sc.nextInt());
		System.out.print("so phat hanh cua tap chi la: ");
		tc.setSoPhatHanh(sc.nextInt());
		System.out.print("ten nha san xuat cua tap chi la: ");
		tc.setTenNhaSx(sc1.nextLine());
		System.out.print("thang phat hanh cua tap chi la: ");
		tc.setThangPhatHanh(sc.nextInt());
		
		Bao ba = new Bao();
		System.out.print("\nma tai lieu cua bao la: ");
		ba.setMaTaiLieu(sc1.nextLine());
		System.out.print("so ban phat hanh cua bao la: ");
		ba.setSoBanPhatHanh(sc.nextInt());
		System.out.print("ten nha san xuat cua bao la: ");
		ba.setTenNhaSx(sc1.nextLine());
		System.out.print("ngay phat hanh cua bao la: ");
		ba.setNgayPhatHanh(sc.nextInt());
		
		System.out.println("\nQuan ly sach: ");
		sa.HienthiSach();
		
		System.out.println("\nQuan ly tap chi: ");
		System.out.println("Ma tai lieu cua tap chi la: " + tc.getMaTaiLieu());
		System.out.println("So ban phat hanh cua tap chi la: " + tc.getSoBanPhatHanh());
		System.out.println("thang phat hanh cua tap chi la: " + tc.getThangPhatHanh());
		System.out.println("So phat hanh cua tap chi la: " + tc.getSoPhatHanh());
		System.out.println("Ten nha san xuat cua tap chi la: " + tc.getTenNhaSx());
		
		System.out.println("\nQuan ly bao: ");
		System.out.println("Ma tai lieu cua tap chi la: " + ba.getMaTaiLieu());
		System.out.println("So ban phat hanh cua tap chi la: " + ba.getSoBanPhatHanh());
		System.out.println("Ngay phat hanh cua bao la: " + ba.getNgayPhatHanh());
		System.out.println("Ten nha san xuat cua bao la: " + ba.getTenNhaSx());


	
	}

}
