

// Nhap thong tin chieu dai, chieu rong hinh chu nhat 
// Tinh chu vi & dien tich hinh chu nhat 


// Xu ly : 
// B1 :  Khai bao kieu du lieu cua hai canh hinh chu nhat, 
// cho phep nguoi dung nhap du lieu cac canh 
// B2 : Neu chieu dai lon hon chieu rong thi thuc hien tinh & xuat ra man hinh ket qua,
// neu ko thi thong bao nhap sai & stop



package ThuyDG;

import java.util.Scanner;

public class TestHinhCN 
{

	public static void main(String[] args) 
	{
		int chieuRong, chieuDai ;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Nhap chieu rong va ENTER: ");
		chieuRong = sc.nextInt();
		
		System.out.println ("Nhap chieu dai va ENTER: ");
		chieuDai = sc.nextInt();
		
		if (chieuDai > chieuRong)
		{
			System.out.println("Chu vi hinh chu nhat la :  " + (chieuDai * 2 + chieuRong * 2));
			System.out.println("Dien tich hinh chu nhat la :  " + (chieuDai * chieuRong ));
		}
		else
		{
			System.out.println("Thong tin nhap vao chua chinh xac, hen gap lai lan sau ! ");
		}

		sc.close();
	}

}
