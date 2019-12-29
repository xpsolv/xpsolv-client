package com.xpsolv.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xpsolv.dao.entity.RegistrationActorEntity;

@Repository
public interface RegistrationUserRepository extends JpaRepository<RegistrationActorEntity, Integer> {

	//ActorRpdModel save(ActorRpdModel registraterAcotr);

}
