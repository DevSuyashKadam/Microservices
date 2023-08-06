package com.example.engine.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Engine {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long engineId;
	private long engineCc;
	private String fuelType;
	public long getEngineId() {
		return engineId;
	}
	public void setEngineId(long engineId) {
		this.engineId = engineId;
	}
	public long getEngineCc() {
		return engineCc;
	}
	public void setEngineCc(long engineCc) {
		this.engineCc = engineCc;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public Engine(long engineId, long engineCc, String fuelType) {
		super();
		this.engineId = engineId;
		this.engineCc = engineCc;
		this.fuelType = fuelType;
	}
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
