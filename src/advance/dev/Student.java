package advance.dev;

public class Student implements Cloneable {
	private String ten;
	private int tuoi;
	private String diaChi;
	private String soDienThoai;
	private double diemTrungBinh;

	// Constructor
	public Student(String ten, int tuoi, String diaChi, String soDienThoai, double diemTrungBinh) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.diemTrungBinh = diemTrungBinh;
	}

	// Getters and Setters
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	// Override the clone() method
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	// Override the toString() method
	@Override
	public String toString() {
		return "Student{" + "ten='" + ten + '\'' + ", tuoi=" + tuoi + ", diaChi='" + diaChi + '\'' + ", soDienThoai='"
				+ soDienThoai + '\'' + ", diemTrungBinh=" + diemTrungBinh + '}';
	}
}
