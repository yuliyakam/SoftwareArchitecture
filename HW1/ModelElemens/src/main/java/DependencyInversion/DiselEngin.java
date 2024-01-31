package DependencyInversion;

public class DiselEngin implements Engine{
    @Override
    public void start() {
        System.out.println("Запустили дизельный двигатель");
    }
}
