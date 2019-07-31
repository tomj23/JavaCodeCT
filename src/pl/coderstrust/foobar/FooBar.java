package pl.coderstrust.foobar;

public class FooBar {

    public static void main(String[] args) {

        int number = 100;

        for (int i = 0; i<=number; i++) {
            if(i%15==0) {
                System.out.println(i + " FooBar");
            } else if(i%3==0) {
                System.out.println(i + "Foo");
            } else if (i%5==0) {
                System.out.println(i + " Bar");
            } else {
                System.out.println(i);
            }
        }
    }
}
