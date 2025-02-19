package DoanXuanHung_23712411;

public class PhongLT extends PhongHoc {

	public boolean datChuan() {
		if (isMayChieu()&& duSang()) {
			return true;
		} else {
		return false;
		}
	}
    private boolean mayChieu;
	public boolean isMayChieu() {
		return mayChieu;
	}
	public void setMayChieu(boolean mayChieu) {
		this.mayChieu = mayChieu;
	}
	public PhongLT(String maPhong, String dayNha, double dienTich, int so, boolean mayChieu) throws Exception {
		super(maPhong, dayNha, dienTich, so);
		this.mayChieu = mayChieu;
	}
	public PhongLT(String maPhong, String dayNha, double dienTich, int so) throws Exception {
		super(maPhong, dayNha, dienTich, so);
		// TODO Auto-generated constructor stub
	}
    @Override
    public String toString() {
    	String datChuan= (datChuan())? "Phong dat chuan" : "Phong khong dat chuan";
    	String mayChieu= (isMayChieu())? "Co may chieu" : "Khong co may chieu";
    	return super.toString();
    }
}
