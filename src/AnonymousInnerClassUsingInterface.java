public class AnonymousInnerClassUsingInterface {
    //https://www.javatpoint.com/anonymous-inner-class
    interface Eatable {
        void eat();
    }

    public static void main(String args[]) {
        Eatable e = new Eatable() {
            @Override
            public void eat() {
                System.out.println("nice fruits");
            }
        };
        e.eat();
    }
}
