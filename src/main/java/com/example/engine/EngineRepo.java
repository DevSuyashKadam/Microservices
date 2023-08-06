package com.example.engine;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.engine.entity.Engine;

public interface EngineRepo extends JpaRepository<Engine, Long> {

//
//	Engine save(Engine e1);
//
	Engine findByEngineId(Long id);

}
