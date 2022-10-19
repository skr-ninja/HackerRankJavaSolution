package extra.oopsconcept.variablehiding;

public class InstanceVariableHiding {

	public static void main(String[] args) {
		InstanceClass obj = new InstanceClass();
		obj.method();


		//===============================================
		//
		//================================================

		Object y;

		y = 'A';
		System.out.println(y.getClass().getName());
		System.out.println(y.getClass().getName().length());

		y = "Hello";
		System.out.println(y.getClass().getName());
		System.out.println(y.getClass().getName().length());

		y= 5;
		System.out.println(y.getClass().getName());
		System.out.println(y.getClass().getName().length());

		y= 5f;
		System.out.println(y.getClass().getName());
		System.out.println(y.getClass().getName().length());

		y= 5L;
		System.out.println(y.getClass().getName());
		System.out.println(y.getClass().getName().length());

		y= 5d;
		System.out.println(y.getClass().getName());
		System.out.println(y.getClass().getName().length());
	}
}