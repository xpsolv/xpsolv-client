package com.xpsolv.business.layer.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xpsolv.dao.entity.RegistrationActorEntity;
import com.xpsolv.dao.registration.RegistrationUserDao;
import com.xpsolv.model.registration.ActorRpdModel;

@Service
public class RegistrationUser {

	/*
	 * @Autowired RegistrationUserDao registrationUserDao;
	 */
	@Autowired
	RegistrationUserDao registrationUserDao;
	
	@Autowired
	RegistrationActorEntity registrationActorEntity;
	
	public String registerUser(ActorRpdModel actorRpdModel) {
		
		registrationActorEntity.setActorFirstName(actorRpdModel.getActorFirstName());
		registrationActorEntity.setActorSurName(actorRpdModel.getActorSurName());
		registrationActorEntity.setActorEmailId(actorRpdModel.getActorEmailId());
		registrationActorEntity.setActorCountryCode(actorRpdModel.getActorCountryCode());
		registrationActorEntity.setActorCountry(actorRpdModel.getActorCountry());
		registrationActorEntity.setActorPhone(actorRpdModel.getActorPhone());
		
		return registrationUserDao.registerActor(registrationActorEntity).toString();
		
	}
}
