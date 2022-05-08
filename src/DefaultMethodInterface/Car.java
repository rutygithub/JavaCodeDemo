package DefaultMethodInterface;

public class Car implements FourWheeler, Vehicle {

    @Override
    public void print() {
        FourWheeler.super.print();
        Vehicle.blowHorn();
    }
}

