package basic_programs;

public class C {

	public static void main(String[] args) {
		String signal = "Green";
		switch(signal) {
		case "Red":
			System.out.println("Please stop");
			break;
		case "Yellow":
			System.out.println("Please slow down");
			break;
		case "Green":
			System.out.println("Please Go");
			break;
		default:
			System.out.println("Not a signal");
		}

	}

}
