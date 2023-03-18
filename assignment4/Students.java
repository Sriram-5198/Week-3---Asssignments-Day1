package assignment4;

public class Students {
	
	public static void getStudentInfo(int id) {
		System.out.println("Student ID: " + id);

	}
	
	public static void getStudentInfo(int id, String name) {
		System.out.println("ID: " + id + " " + "Name: " + name);

	}
	
	public static void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Email ID: " + email + " & " + "Phone number: " + phoneNumber);

	}

	public static void main(String[] args) {
		getStudentInfo(16074);
		getStudentInfo(16074, "Ram");
		getStudentInfo("ram01@gmail.com",9876543210l);
        
	}

}
