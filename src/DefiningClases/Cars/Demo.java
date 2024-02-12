package DefiningClases.Cars;

import DefiningClases.Cars.Car;

public class Demo {
    public static void main(String[] args) {

        Car car = new Car("sedan", "Opel", "RED", 120);

        Car car2 = new Car("BMW","Red", 204);

        Car car3 = new Car("KIA", 115);


        System.out.println(car.getColor());
    }
}
