package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCountCars(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("model1", "color1", "engine1"));
        cars.add(new Car("model2", "color2", "engine2"));
        cars.add(new Car("model3", "color3", "engine3"));
        cars.add(new Car("model4", "color4", "engine4"));
        cars.add(new Car("model5", "color5", "engine5"));

        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
