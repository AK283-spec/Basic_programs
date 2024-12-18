package OOPS;

public class constructor {
	
	public constructor() {
		System.out.println("constructor");
	}
	
	public constructor(String x) {
		System.out.println("constructor" + x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor obj = new constructor();
		constructor obj2 = new constructor("test");

	}

}
