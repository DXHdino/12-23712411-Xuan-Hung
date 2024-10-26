package DoanXuanHung_23712411;

import java.util.Objects;

public abstract class PhongHoc {
	// Phuong thuc ao
public abstract boolean datChuan();
protected String maPhong, dayNha;
protected double dienTich;
protected int soBongDien;
//  dong goi
public String getMaPhong() {
	return maPhong;
}
public void setMaPhong(String maPhong) {
	this.maPhong = maPhong;
}
public String getDayNha() {
	return dayNha;
}
public void setDayNha(String dayNha) {
	this.dayNha = dayNha;
}
public double getDienTich() {
	return dienTich;
}
public void setDienTich(double dienTich) {
	this.dienTich = dienTich;
}
public int getSoBongDien() {
	return soBongDien;
}
public void setSoBongDien(int so) throws Exception {
	if (so>0) {
		this. soBongDien = so;
	} else {
		throw new Exception("1");
	}
// tao ham tao (Constructor)
	
}
public PhongHoc(String maPhong, String dayNha, double dienTich, int so) throws Exception {
	super();
	this.maPhong = maPhong;
	this.dayNha = dayNha;
	this.dienTich = dienTich;
		if (so>0) {
			this. soBongDien = so;
		} else {
			throw new Exception("1");
		}
}
    public boolean duSang() {
    	if (getDienTich()/getSoBongDien()<=10) {
    		return true;
    	} else {
    	return false;
    	}
    }
    @Override
    public String toString() {
        String duSang=duSang()? "Du Anh Sang":"Khong du anh sang";
    String s="";
    s+=s.format("|%10s|%10s|%10s|%10s|%10s|",getMaPhong(), getDayNha(), getDienTich(), getSoBongDien(),duSang);
    	return s;
    
	}
	@Override
	public int hashCode() {
		return Objects.hash(maPhong);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongHoc other = (PhongHoc) obj;
		return Objects.equals(maPhong, other.maPhong);
	}
}
