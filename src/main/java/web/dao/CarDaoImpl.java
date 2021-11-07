package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Vaz", 2109, "Red"));
        cars.add(new Car("Gaz", 21, "Blue"));
        cars.add(new Car("Zaz", 965, "Yellow"));
        cars.add(new Car("Uaz", 469, "Green"));
        cars.add(new Car("Azlk", 2141, "White"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0 || count >= 5) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
