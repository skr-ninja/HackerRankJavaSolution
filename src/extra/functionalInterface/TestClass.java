package extra.functionalInterface;

public class TestClass {

    public static void main(String[] args) {

        Test t = new Test();
        t.test();
        TestInterface.staticMethod();
        System.out.println("====Add===" + t.add(5, 5));
        System.out.println("====Sub===" + t.sub(5, 5));
        System.out.println("====Prod===" + t.product(5, 5));
        System.out.println("====Div===" + t.div(5, 5));
    }
}
