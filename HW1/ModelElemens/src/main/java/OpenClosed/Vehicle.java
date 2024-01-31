package OpenClosed;

public class Vehicle {
    public int maxSpeed;
    public String type;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }


    public double calculateAllowedSpeed() {
        /**
         *     if (type.equals("Car")) return maxSpeed * 2;
         *     if (type.equals("Moto")) return maxSpeed * 1.7;
         *     В такой реализации слишком много проверок на тип транспорта
         *     Вместо этого все ТС должны реализовывать этот метод но возвращать
         *     соответствующее для них значение
         */
        return maxSpeed;
    }
}
