package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{
    private static final List<Car> cars = new ArrayList<>();
    static {
        cars.add(new Car("модель1","цвет1",2001,1000000));
        cars.add(new Car("модель2","цвет2",2002,1100000));
        cars.add(new Car("модель3","цвет3",2003,2000000));
        cars.add(new Car("модель4","цвет4",2004,3000000.50));
        cars.add(new Car("модель5","цвет5",2005,900000.00));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }

}
