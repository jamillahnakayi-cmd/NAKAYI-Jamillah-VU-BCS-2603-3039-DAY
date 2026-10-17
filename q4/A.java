public class A implements X, Y {

    @Override
    public void a(String s) {
        System.out.println("Method a() received: " + s);
    }

    public static void main(String[] args) {
        A obj = new A();

        X.m();
        Y.m();

        System.out.println("W from X = " + X.W);
        System.out.println("W from Y = " + Y.W);

        obj.a("Hello Victoria University");

        System.out.println("Square of 4 = " + obj.b(4));
    }
}
