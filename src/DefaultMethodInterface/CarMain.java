package DefaultMethodInterface;

public class CarMain {
    //https://www.runoob.com/java/java8-default-methods.html
    //不过一般不推荐interface里面有default method
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.print();
    }
}
