package pl.kurs.model;

public class Car {
    private String brand;
    private String model;
    private int yearOfProduction;
    private double power;

    public Car(String brand, String model, int yearOfProduction, double power) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", power=" + power +
                '}';
    }
}
