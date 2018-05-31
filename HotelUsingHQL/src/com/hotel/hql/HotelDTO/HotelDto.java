package com.hotel.hql.HotelDTO;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


import javax.persistence.Id;


@Entity
@Table(name="HotelHQL")

public class HotelDto implements Serializable {
	
	@Id
	
	@GenericGenerator(name = "myid", strategy = "increment")
	@GeneratedValue(generator="myid")
	
	@Column(name="id")
	private int id;
	
	@Column(name="hotelName")
	private String hotelName;
	
	@Column(name="ownerName")
	private String ownerName;
	
	@Column(name="place")
	private String place;
	
	@Column(name="address")
	private String address;
	
	@Column(name="noOfRoom")
	private int noOfRoom;
	
	@Column(name="rentPerDay")
	private double rentPerDay;
	
	@Column(name="typeOfRoom")
	private String typeOfRoom;
	
	public HotelDto() {

		System.out.println("DTO object created");
		
	}
	

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNoOfRoom() {
		return noOfRoom;
	}
	public void setNoOfRoom(int noOfRoom) {
		this.noOfRoom = noOfRoom;
	}
	public double getRentPerDay() {
		return rentPerDay;
	}
	public void setRentPerDay(double rentPerDay) {
		this.rentPerDay = rentPerDay;
	}
	public String getTypeOfRoom() {
		return typeOfRoom;
	}
	public void setTypeOfRoom(String typeOfRoom) {
		this.typeOfRoom = typeOfRoom;
	}
	
	
	

}
