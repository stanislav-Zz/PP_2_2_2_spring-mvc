package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getMyCar () {


        Car car1 = new Car("Bmw", "red", 2020);
        Car car2 = new Car("Mersedes", "blue", 1978);
        Car car3 = new Car("Vesta", "yellow", 2023);
        Car car4 = new Car("Opel", "white", 1989);
        Car car5 = new Car("Kamaz", "green", 1965);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        return cars;
    }
}
