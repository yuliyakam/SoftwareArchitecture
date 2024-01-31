package DependencyInversion;

public class MainDependenInver {
    public static void main(String[] args) {
        Car car = new Car(new DiselEngin());
        car.start();
        car = new Car(new PetrolEngine());
        car.start();
    }
}
