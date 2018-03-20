package Phamduydieu;

import java.util.Scanner;

public class BTVN_DangKyKetBan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("MỜI BẠN NHẬP THÔNG TIN ĐĂNG KÝ:");
		System.out.print("Họ Và Tên:               ");
		String HoVaTen = sc.nextLine();	
		System.out.print("Tuổi:                    ");
		int Tuoi = sc.nextInt();
		System.out.print("Giới Tính: \n[1]: Nam\n[2]: Nữ                  ");
		int GioiTinh = sc.nextInt();
		System.out.print("Tình Trạng Hôn Nhân: \n [1] Chưa có gia đình \n [2] Ly Hôn \n [3] Đã Lập Gia Đình     ");
		int TinhTrangHonNhan = sc.nextInt();
		if (Tuoi > 19)
		{
			switch (GioiTinh)
			{
			case 1:
				if(Tuoi>=22)
				{									
					switch (TinhTrangHonNhan)
					{
					case 1:
					System.out.println("Chúc mừng bạn "+ HoVaTen + "\nBạn đã đăng ký tham gia thành công..!");
					break;
					case 2:
					System.out.println("Chúc mừng bạn "+ HoVaTen + "\nBạn đã đăng ký tham gia thành công..!");
					break;
					default :
					System.out.println("Bạn không thuộc đối tượng tham gia..!\nYêu cầu chưa có gia đình hoặc đã ly hôn..!");	
					}
				}
				else
					System.out.println("Bạn không thuộc đối tượng tham gia..!\nYêu cầu nam lớn hơn 22 tuổi..!");
			break;
			case 2:
					if(Tuoi>=19)
					{									
						switch (TinhTrangHonNhan)
						{
						case 1:
						System.out.println("Chúc mừng bạn "+ HoVaTen + "\nBạn đã đăng ký tham gia thành công..!");
						break;
						case 2:
						System.out.println("Chúc mừng bạn "+ HoVaTen + "\nBạn đã đăng ký tham gia thành công..!");
						break;
						default :
						System.out.println("Bạn không thuộc đối tượng tham gia..!\nĐối tượng tham gia đã ly hôn hoặc chưa có gia đình..!");	
						}
					}
					else
						System.out.println("Bạn không thuộc đối tượng tham gia..!\nYêu cầu nữ lớn hơn 19 tuổi.");
				break;
					default :
						System.out.println("Giới tính không xác định.\nBạn không thuộc đối tượng tham gia..!");
			}
		}
		else
			System.out.println("Bạn không thuộc đối tượng tham gia..!\nBạn phải lớn hơn 19 tuổi.");	
	}

}
