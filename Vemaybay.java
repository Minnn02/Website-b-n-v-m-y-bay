
public class Vemaybay {
    private int maVe;
	private String  sanBay;
	private String changBay;
	private int ngayBay;
	private String nhaGa;
	private int soGhe;
	private double donGia;
	private String ISBN;
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	public Vemaybay(int maVe,String  sanBay,String changBay,int ngayBay,String nhaGa,int soGhe,double donGia,String ISBN){
		super();
		this.maVe = maVe;
		this.sanBay = sanBay;
		this.changBay = changBay;
		this.ngayBay = ngayBay;
		this.nhaGa = nhaGa;
		this.soGhe = soGhe;
		this.donGia = donGia;	
		this.ISBN = ISBN;
	}
	public Vemaybay(int maVe){
		this(maVe,"","",0,"",0,0,"");
	}
	public Vemaybay() {
		this(0);
	}
	public int hashCode() {
		final int prime=31;
		int result=1;
		result = prime*result+maVe;
		return result;
	}
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!= obj.getClass())
			return false;
		Vemaybay other=(Vemaybay) obj;
		if(maVe!=other.maVe)
			return false;
		return true;
	}
	public String toString() {
		return maVe+";"+sanBay+";"+changBay+";"+ngayBay+";"+nhaGa+";"+soGhe+";"+donGia+";"+ISBN;
	}
	public int getMaVe() {
		return maVe;
	}
	public void setMaVe(int maVe) {
		this.maVe = maVe;
	}
	public String getSanBay() {
		return sanBay;
	}
	public void setSanBay(String sanBay) {
		this.sanBay = sanBay;
	}
	public String getChangBay() {
		return changBay;
	}
	public void setChangBay(String changBay) {
		this.changBay = changBay;
	}
	public int getNgayBay() {
		return ngayBay;
	}
	public void setNgayBay(int ngayBay) {
		this.ngayBay = ngayBay;
	}
	public String getNhaGa() {
		return nhaGa;
	}
	public void setNhaGa(String nhaGa) {
		this.nhaGa = nhaGa;
	}
	public int getSoGhe() {
		return soGhe;
	}
	public void setSoGhe(int soGhe) {
		this.soGhe = soGhe;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
 
}
