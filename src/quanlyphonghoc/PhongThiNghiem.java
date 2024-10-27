package quanlyphonghoc;

public class PhongThiNghiem extends PhongHoc {
	private String chuyenNganh;
	private int suaChua;
	private boolean coBonRua;
	public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen,String chuyenNganh,int suaChua,boolean coBonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
		this.chuyenNganh = chuyenNganh;
		this.coBonRua = coBonRua;
		this.suaChua = suaChua;
	}
		
	
	public String getChuyenNganh() {
		return chuyenNganh;
	}


	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}


	public int getSuaChua() {
		return suaChua;
	}


	public void setSuaChua(int suaChua) {
		this.suaChua = suaChua;
	}


	public boolean isCoBonRua() {
		return coBonRua;
	}


	public void setCoBonRua(boolean coBonRua) {
		this.coBonRua = coBonRua;
	}


	@Override
	public boolean datChuan() {
		// TODO Auto-generated method stub
		return duAnhSang() && coBonRua ;
	}


	@Override
	public String toString() {
		return "PhongThiNghiem [chuyenNganh=" + chuyenNganh + ", suaChua=" + suaChua + ", coBonRua=" + coBonRua + "]";
	}
	
	

}
