package com.xpsolv.dao.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xpsolv.dao.entity.RegistrationActorEntity;
import com.xpsolv.dao.repositories.RegistrationUserRepository;

@Service
public class RegistrationUserDao {

	@Autowired
	RegistrationUserRepository registrationUserRepository;

	
	  public RegistrationActorEntity registerActor(RegistrationActorEntity registrationActorEntity) {
	  
	  System.out.println(registrationActorEntity); 
	  return registrationUserRepository.save(registrationActorEntity); }
	 

}
