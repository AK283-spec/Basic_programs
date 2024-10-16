package Method_overloading_overriding;

public class overloading {
	public void add() {
		System.out.println("normal method");
	}
	
	public void add(int x) {
		System.out.println("normal method with "+x);
	}
	
	public void add(int x, float y) {
		System.out.println("normal method with "+y+"and"+x);
	}

	public static void main(String[] args) {
		overloading obj = new overloading();
		obj.add();
		obj.add(34);
		obj.add(64, 32.56f);

	}

}
