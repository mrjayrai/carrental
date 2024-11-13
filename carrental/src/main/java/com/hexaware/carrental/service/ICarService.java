package com.hexaware.carrental.service;
/*
 * @Author: Pritesh Rai 
 * Description: Created Service Interface for Cars
 * Date: 9th Nov 24
 */
import java.time.LocalDateTime;
import java.util.List;

import com.hexaware.carrental.entity.Car;

public interface ICarService {
	List<Car> getAllCars();
	List<Car> findCarsByType(String carType);
    List<Car> findCarsByCompany(String carCompany);
    List<Car> findCarsByModel(String carModel);
    List<Car> findCarsByYear(int year);
    boolean addCar(Car car);
    boolean updateCar(int carId, Car updatedCar);
    boolean deleteCar(int carId);
    boolean isCarAvailable(int carId, LocalDateTime dateTime);
}
