package com.co.zamora.commons.service;

import java.util.Optional; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


public class CommonServiceImpl <E, R extends CrudRepository<E, Long>> implements CommonService<E> {
	@Autowired
	private R dao;
	
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<E> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<E> findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	@Transactional
	public E save(E entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}

	@Override
	@Transactional
	public void deleteByid(Long id) {
		dao.deleteById(id);
		
	}
}	
