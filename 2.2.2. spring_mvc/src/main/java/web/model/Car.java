package web.model;


public class Car {
    private String vendor;
    private String model;
    private int yearOfStartProd;

    public Car() {
    }

    public Car(String vendor, String model, int yearOfStartProd) {
        this.vendor = vendor;
        this.model = model;
        this.yearOfStartProd = yearOfStartProd;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfStartProd() {
        return yearOfStartProd;
    }

    public void setYearOfStartProd(int yearOfStartProd) {
        this.yearOfStartProd = yearOfStartProd;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vendor='" + vendor + '\'' +
                ", model='" + model + '\'' +
                ", yearOfStartProd=" + yearOfStartProd +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (yearOfStartProd != car.yearOfStartProd) return false;
        if (!vendor.equals(car.vendor)) return false;
        return model.equals(car.model);
    }

    @Override
    public int hashCode() {
        int result = vendor.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + yearOfStartProd;
        return result;
    }
}
