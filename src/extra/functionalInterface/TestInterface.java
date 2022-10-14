package extra.functionalInterface;

@FunctionalInterface
public interface TestInterface {

    void test();

    default int add(int a, int b) {
        System.out.println("I am Default Method For Addition");
        return a + b;
    }

    default int sub(int a, int b) {
        System.out.println("I am Default Method For Subtract");
        return a - b;
    }

    default int product(int a, int b) {
        System.out.println("I am Default Method For Product");
        return a * b;
    }

    default int div(int a, int b) {
        System.out.println("I am Default Method For Division");
        return a / b;
    }

    public static void staticMethod() {
        System.out.println("I am Static Method");
    }
}
