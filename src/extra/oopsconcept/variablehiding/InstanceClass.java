package extra.oopsconcept.variablehiding;

class InstanceClass {
	private int value = 10;
	void method() {
		int value = 40;
		System.out.println("Value of Instance variable: "+this.value);
		System.out.println("Value of Local variable: "+ value);
	}
}
