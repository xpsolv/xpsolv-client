package com.xpsolv.dao.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xpsolv.dao.entity.RegistrationSmePDDaoEntity;
import com.xpsolv.dao.repositories.RegistrationSmePDRepository;

@Service
public class RegistrationSmeDao {

	@Autowired
	RegistrationSmePDRepository registrationSmePDRepository;

	public RegistrationSmePDDaoEntity registerSmePd(RegistrationSmePDDaoEntity registrationSmePDDaoEntity) {

		System.out.println(registrationSmePDDaoEntity);
		return registrationSmePDRepository.save(registrationSmePDDaoEntity);
	}

}
