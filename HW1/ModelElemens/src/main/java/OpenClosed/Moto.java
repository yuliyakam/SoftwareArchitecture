package OpenClosed;

public class Moto extends Vehicle{
    @Override
    public double calculateAllowedSpeed() {
        return maxSpeed * 1.8;
    }

    public Moto(int maxSpeed) {
        super(maxSpeed, "Moto");
    }
}
