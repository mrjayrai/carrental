package com.hexaware.carrental.service;

/*
 * @Author: Pritesh Rai 
 * Description: Created Service Interface Implementation for Cars
 * Date: 9th Nov 24
 */
import java.time.LocalDateTime;
import java.util.List;

import com.hexaware.carrental.entity.Car;

public class CarServiceImpl implements ICarService {

	@Override
	public List<Car> getAllCars() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Car> findCarsByType(String carType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Car> findCarsByCompany(String carCompany) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Car> findCarsByModel(String carModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Car> findCarsByYear(int year) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addCar(Car car) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCar(int carId, Car updatedCar) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCar(int carId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCarAvailable(int carId, LocalDateTime dateTime) {
		// TODO Auto-generated method stub
		return false;
	}

}
