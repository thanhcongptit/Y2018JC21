package STUDENTS.DoKhacTu;

public class Sach extends TaiLieu {
   private String tenTacGia;
   private int soTrang;
public String getTenTacGia() {
	return tenTacGia;
}
public void setTenTacGia(String tenTacGia) {
	this.tenTacGia = tenTacGia;
}
public int getSoTrang() {
	return soTrang;
}
public void setSoTrang(int soTrang) {
	this.soTrang = soTrang;
}
   public void HienthiSach()
   {
	  System.out.println("Ma tai lieu cua sach la: " + getMaTaiLieu());
	  System.out.println("So ban phat hanh cua sach la: " + getSoBanPhatHanh());
	  System.out.println("So trang cua sach la: " + getSoTrang());
	  System.out.println("Ten tac gia cua sach la: " + getTenTacGia());
	  System.out.println("Ten nha san xuat cua sach la: " + getTenNhaSx());

	  

   }
}
