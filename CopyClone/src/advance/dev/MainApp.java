package advance.dev;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {            
            Student std1 = new Student("Hoai", 20, "Hue cityt", "123456789", 9.5);
            
            Student std2 = (Student) std1.clone();

            System.out.println("Thong tin Student 1: " + std1.toString());
            System.out.println("Thong tin Student 2 (sao chep tu Student 1): " + std2.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
	}

}
