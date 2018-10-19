package nasljedjivanje;

public class Test {
	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setName("Name");
		admin.setPassword("Password");
		admin.setUsername("Admincic");
		admin.setRole("Admin");
		
		admin.userMetoda();
		admin.adminMetoda();

		System.out.println(admin.toString());
		Regular regular = new Regular();
		regular.setName("Regu Larni");
		regular.setUsername("Regi");
		regular.setPassword("123456");
		regular.setRole("regular");
		
		regular.userMetoda();
		regular.regularMetoda();
		
		System.out.println(regular.toString());

	}
}