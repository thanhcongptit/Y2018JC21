

// Nhap thong tin chieu dai, chieu rong hinh chu nhat 
// Tinh chu vi & dien tich hinh chu nhat 


// Xu ly : 
// B1 :  Khai bao kieu du lieu cua hai canh hinh chu nhat, 
// cho phep nguoi dung nhap du lieu cac canh 
// B2 : Neu chieu dai lon hon chieu rong thi thuc hien tinh & xuat ra man hinh ket qua,
// neu ko thi thong bao nhap sai & stop


package comba.imic;

import java.util.Scanner;

public class HinhChuNhat 
{

	public static void main(String[] args) 
	{
		System.out.println("Bai tap tinh chu vi va dien tich hinh chu nhat ! ");
		
		Scanner sc = new Scanner (System.in);	
		
		System.out.print("Nhap chieu dai va ENTER: ");
		int chieuDai = sc.nextInt();
		
		System.out.print("Nhap chieu rong va ENTER:  ");
		int chieuRong = sc.nextInt();
		
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
