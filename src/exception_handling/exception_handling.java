package exception_handling;

public class exception_handling {

	public static void main(String[] args) {
		String name = "deepika padukone";
		
		try {
			System.out.println(name.charAt(3));
		}
		catch(Exception e) {
			System.out.println("Handled");
		}
		finally {
			System.out.println("finally block");
		}

	}

}
