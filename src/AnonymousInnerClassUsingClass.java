public class AnonymousInnerClassUsingClass {
    //https://www.javatpoint.com/anonymous-inner-class
    abstract static class Person {
        abstract void eat();
    }

    public static void main(String args[]) {
        Person p = new Person() {
            @Override
            void eat() {
                System.out.println("nice fruits");
            }
        };
        p.eat();
    }
}
