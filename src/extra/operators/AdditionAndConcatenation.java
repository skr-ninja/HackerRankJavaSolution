package extra.operators;

public class AdditionAndConcatenation {

	public static void main(String[] args) {

		System.out.println(2 + 0 + 1 + 8 + "Sunil"); //output will be "11Sunil"
        System.out.println("Sunil" + 2 + 0 + 1 + 8);  //output will be "Sunil2018"
        System.out.println(2 + 0 + 1 + 6 + "Sunil" + 2 + 0 + 1 + 8);//output will be "9Sunil2018"
        System.out.println(2 + 0 + 1 + 6 + "Sunil" + ( 2 + 0 + 1 + 8));//output will be "9Sunil11"
	}
}