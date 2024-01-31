package OpenClosed;

public class Car extends Vehicle{
    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    @Override
    public double calculateAllowedSpeed() {
        return super.maxSpeed * 2;
    }
}
