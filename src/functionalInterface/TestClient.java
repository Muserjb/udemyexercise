package functionalInterface;

public class TestClient {
    public void lamdaTest(FunctionalInterface fi) {
        fi.test();
    }

    public static void main(String[] args) {


        new TestClient().lamdaTest(()-> System.out.println("Java indepht"));

    }
}
