package Phamduydieu;

import java.util.Scanner;

import com.sun.java.util.jar.pack.Instruction.Switch;

public class BTVN_ThamGiaKetBan 
{

	public static void main(String[] args) 
	{
/*
  Yêu cầu người dùng nhập vào các thông tin liên quan cho việc xử lý thông tin.
    Phải kiểm tra tất cả những trường thông tin bắt buộc phải nhập như : Tên,
Tuổi, Tình trạng hôn nhân, Giới tính.
 Xử lý nghiệp vụ đăng ký tham gia kết bạn. Yêu cầu người dùng nhập các thông
tin: Tên, Tuổi, Giới tính và Tình trạng hôn nhân. Các qui định bắt buộc khi tham gia :
o Thành viên là Nam, độ tuổi >= 22 tuổi và chưa có gia đình hoặc ly hôn
 được phép tham gia.
o Thành viên là Nữ, độ tuổi >= 19 tuổi và chưa có gia đình hoặc ly hôn
 được phép tham gia.
o Tất cả các thành viên tuổi < 19
 không được tham gia.
 */
		Scanner sc = new Scanner(System.in);
		System.out.println("MỜI BẠN NHẬP THÔNG TIN ĐĂNG KÝ:");
		System.out.print("Họ Và Tên: ");
		String HoVaTen = sc.next();
		System.out.print("Tuổi: ");
		int Tuoi = sc.nextInt();
		System.out.print("Giới Tính: ");
		String GioiTinh = sc.next();
		System.out.print("Tình Trạng Hôn Nhân: \n [1] Chưa có gia đình \n [2] Ly Hôn \n [3] Đã Lập Gia Đình");
		int TinhTrangHonNhan = sc.nextInt();
		if (Tuoi == 19)
		{
			switch (GioiTinh)
			{
				case "Nam":
				if(Tuoi>=22)
				{									
					switch (TinhTrangHonNhan)
					{
					case 1:
					System.out.println("Bạn đã đăng ký tham gia thành công..!");
					break;
					case 2:
					System.out.println("Bạn đã đăng ký tham gia thành công..!");
					break;
					default :
					System.out.println("Bạn không thuộc đối tượng tham gia..!");	
					}
				}
				else
					System.out.println("Bạn không thuộc đối tượng tham gia..!");
				case "Nữ":
					if(Tuoi>=19)
					{									
						switch (TinhTrangHonNhan)
						{
						case 1:
						System.out.println("Bạn đã đăng ký tham gia thành công..!");
						break;
						case 2:
						System.out.println("Bạn đã đăng ký tham gia thành công..!");
						break;
						default :
						System.out.println("Bạn không thuộc đối tượng tham gia..!");	
						}
					}
					else
						System.out.println("Bạn không thuộc đối tượng tham gia..!");
					default :
						System.out.println("Bạn không thuộc đối tượng tham gia..!");
			}
		}

	}

}
