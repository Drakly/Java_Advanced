package DefiningClases.Cars;

import java.security.spec.RSAOtherPrimeInfo;

public class Car {

    private String type;
    private String model;
    private String color;
    private int horsepower;


    public Car(String model, int horsepower) {
       this(model, null, horsepower);
    }

    public Car(String model, String color, int horsepower) {
        this(null, model, color, horsepower);
    }

    public Car(String type ,String model, String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHorsepower(int horsepower) {
        if (horsepower > 0) {
            this.horsepower = horsepower;
        }else {
            System.out.println("Horsepower must be bigger than zero");
        }
    }
}
