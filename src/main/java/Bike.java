import com.opencsv.bean.CsvBindByName;

public class Bike {

    @CsvBindByName(column = "brand")
    private String brand;

    @CsvBindByName(column = "model")
    private String model;

    @CsvBindByName(column = "year")
    private int year;



    @CsvBindByName(column = "capacity")
    private int capacity;

    @CsvBindByName(column = "hp")
    private int hp;

    @CsvBindByName(column = "weight")
    private int weight;

    @CsvBindByName(column = "tank")
    private int tank;

    @CsvBindByName(column = "speed")
    private int speed;

    @CsvBindByName(column = "acceleration")
    private double acceleration;

    public Bike() {}

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getHp() {
        return hp;
    }

    public int getWeight() {
        return weight;
    }

    public int getTank() {
        return tank;
    }

    public int getMaxSpeed() {
        return speed;
    }

    public double getAcceleration() {
        return acceleration;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                ", year = " + year +
                ", capacity = " + capacity +
                ", hp = " + hp +
                ", weight = " + weight +
                ", tank = " + tank +
                ", maxSpeed = " + speed +
                ", acceleration = " + acceleration +
                '}';
    }
}
