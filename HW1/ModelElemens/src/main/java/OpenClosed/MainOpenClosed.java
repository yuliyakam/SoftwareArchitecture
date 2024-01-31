package OpenClosed;

public class MainOpenClosed {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(300, "Train");
        printVehicleMaxSpeed(vehicle);
        vehicle = new Car(200);
        printVehicleMaxSpeed(vehicle);
    }
    public static void printVehicleMaxSpeed(Vehicle vehicle){
        System.out.println(vehicle.type + " maxSpeed = " + vehicle.calculateAllowedSpeed());
    }
}
