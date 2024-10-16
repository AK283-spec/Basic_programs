package Method_overloading_overriding;

public class overriding_child extends overriding_parent {
	
	public void add() {
		System.out.println("child text");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overriding_child obj = new overriding_child();
		obj.add();
	}

}
