package backend;

public class Car {

    private String model;
    private String color;
    private String year;
    private String engineType;

    public Car(String model, String color, String year) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.engineType = "Standard";
    }

    public Car(String model, String color, String year,String engineType) {
        this(model,color,year);
        this.engineType = engineType;
    }


 @Override
    public String toString() {
        return "Car [model=" + model + ", color=" + color + ", year=" + year + ", engineType=" + engineType + "]";
    }

public static void main(String[] args) {
   

    }
}
