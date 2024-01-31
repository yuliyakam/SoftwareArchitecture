package InterfaceSegregation;

public class Cube implements Shape3D{
    int len;

    @Override
    public double perimetr() {
        return len * 12;
    }
    //Если бы мы захотели добавить объем, то и у круга пришлось писать бы
    //но для круга это не нужно. Поэтому для этого создадим др интерфейс
    //Shape3D и в классе Cube имплементируем его. Или можно расширить класс
    //Shape интерфейсом Shape3D. Тогда классы от Shape3D будут знать о мето
    //дах и Shape и Shape3D

    public Cube(int len) {
        this.len = len;
    }

    @Override
    public double volume() {
        return len * len * len;
    }
}
