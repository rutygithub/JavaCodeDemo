package UpcastingAndDownCasting;

//https://www.geeksforgeeks.org/upcasting-vs-downcasting-in-java/
//https://www.youtube.com/watch?v=HpuH7n9VOYk   coding with John
// Demo class to see the difference
// between upcasting and downcasting
public class GFG {
    // Driver code
    public static void main(String[] args) {
        // Upcasting, java do upcasting implicitly
        Parent p = new Child();
        p.name = "GeeksforGeeks";

        System.out.println("this is an example for upcasting");
        //Printing the parentclass name
        System.out.println(p.name);
        //parent class method is overriden method hence this will be executed
        //it'll execute son class method, since it's indeed a Child class object.
        p.method();


        // Trying to Downcasting Implicitly
        // Child c = new Parent(); - > compile time error

        // Downcasting Explicitly
        Child c = (Child) p;

        c.id = 1;
        System.out.println("this is an example for downcasting");
        System.out.println(c.name);
        System.out.println(c.id);
        c.method();

        Parent p1 = new Parent();
        //probably it'll have a compiling error when downcasting
//        Child c1 = (Child) p1;  compile time error
        System.out.println("this is new downcasting example");
//        c1.method();
        Child c2 = new Child();
        Parent p2 = new Parent();
        p2 = c2;
        System.out.println("this is new upcasting example");
        p2.method();


    }
}
