package com.univ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarRentalService {

    @Autowired
    CarRepository carRepository;

    public CarRentalService(CarRepository carRepository){
        this.carRepository = carRepository;
        Car ferrari = new Car("11AA22", "Ferrari", 1000);
		carRepository.save(ferrari);
		//cars.add(ferrari);
        Car clio = new Car("22BB33", "Clio", 200);
		carRepository.save(clio);
        Car twingo = new Car("33CC44", "Twingo", 300);
		carRepository.save(twingo);
    }

    public Car save(Car car){return carRepository.save(car);}

    public Iterable<Car> findAll() {
        return null;
    }
}
