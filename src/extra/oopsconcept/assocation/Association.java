package extra.oopsconcept.assocation;

public class Association {

	public static void main(String[] args) {
		Bank bank = new Bank("ICICI Bank");
		Employee emp = new Employee("SUNIL");
		System.out.println(emp.getEmployee() + " is employee of " + bank.getBankName());
	}
}