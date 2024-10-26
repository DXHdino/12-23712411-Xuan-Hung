package DoanXuanHung_23712411;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListPhong {
	List<PhongHoc> ls;
	public ListPhong() {
		ls= new ArrayList<PhongHoc>(2);
	}
    // them phong
	public boolean themPhong(PhongHoc p) {
		if (ls.contains(p)) {
			return false;
		} else {
			return ls.add(p);
		}
	}
	//sap xep
	public void sapXep() {
		Collections.sort(ls, new Comparator<PhongHoc>() {

			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				String x= new String(o1.getMaPhong());
				String y= new String(o2.getMaPhong());
				return x.compareToIgnoreCase(y);
			}
			
		});
	}
	// xuat danh sach
	public List<PhongHoc> 	xuatDS() {
		return ls;
	}
	// xuat danh phong dat chuan
	public List<PhongHoc> dsPhongDatChuan() {
		List<PhongHoc> dsDC= new ArrayList<PhongHoc>();
		for (PhongHoc ph : ls) {
			if (ph.datChuan())
				dsDC.add(ph);
			return dsDC;
		}
		return null;
	}
}
