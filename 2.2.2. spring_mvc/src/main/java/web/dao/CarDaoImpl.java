package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    private List<Car> cars = new ArrayList<>();

    public CarDaoImpl() {
        cars.add(new Car("FORD", "Mustang", 1976));
        cars.add(new Car("Chevrolet", "Camaro", 2017));
        cars.add(new Car("Mitsubishi", "Pajero Evolution", 2003));
        cars.add(new Car("Dodge", "RAM F-150", 2010));
        cars.add(new Car("Bugatti", "Veyron", 2011));
    }

    @Override
    public void save(Car car) {
        cars.add(car);
    }

    @Override
    public void delete(Car car) {
        cars.remove(car);
    }

    @Override
    public List<Car> getAll() {
        return cars;
    }

    @Override
    public Car getById(int id) {
        return cars.get(id);
    }
}
