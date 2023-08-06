package com.example.engine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.engine.EngineRepo;
import com.example.engine.entity.Engine;

@Service
public class EngineService {

	@Autowired
	EngineRepo er;
	
//	public Engine saveEngine(Engine e1) {
//		// TODO Auto-generated method stub
//		return er.save(e1);
//	}
//
//	public Engine getEnginebyId(Long id) {
//		// TODO Auto-generated method stub
//		return er.findByEngineId(id);
//	}

	
	public Engine saveEngine(Engine e1) {
		return er.save(e1);
		
	}
	
	public Engine getEnginebyId(Long id) {
		return er.findByEngineId(id);
		
	}
	
	
	
}
