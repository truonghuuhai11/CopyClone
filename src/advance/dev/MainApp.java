package advance.dev;

public class MainApp {
	public static void main(String[] args) {
		// Khởi tạo đối tượng Student std1
		Student std1 = new Student("Nguyen Van A", 20, "123 Nguyen Trai, Hanoi", "0909123456", 8.5);

		try {
			// Sử dụng phương thức clone để sao chép đối tượng std1 sang Student std2
			Student std2 = (Student) std1.clone();

			// In ra màn hình phương thức toString() của 2 đối tượng std1 và std2
			System.out.println("Thông tin của std1: " + std1);
			System.out.println("Thông tin của std2: " + std2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
