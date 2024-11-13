package com.hexaware.carrental.entity;
/*
 * @Author: Pritesh Rai 
 * Description: Created POJO class for Cars
 * Date: 9th Nov 24
 */
import java.time.Year;

public class Car {
	private int carId;
	private String carCompany;
	private String carModel;
	private Year carYear;
	private String licensePlate;
	private String carType;
	private double farePrice;
	
	public Car() {
		super();
	}

	public Car(int carId, String carCompany, String carModel, Year carYear, String licensePlate,
			String carType, double farePrice) {
		super();
		this.carId = carId;
		this.carCompany = carCompany;
		this.carModel = carModel;
		this.carYear = carYear;
		this.licensePlate = licensePlate;
		this.carType = carType;
		this.farePrice = farePrice;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarCompany() {
		return carCompany;
	}

	public void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public Year getCarYear() {
		return carYear;
	}

	public void setCarYear(Year carYear) {
		this.carYear = carYear;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public double getFarePrice() {
		return farePrice;
	}

	public void setFarePrice(double farePrice) {
		this.farePrice = farePrice;
	}
	
	
	
}