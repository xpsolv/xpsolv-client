package com.xpsolv.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xpsolv.dao.entity.RegistrationSmePDDaoEntity;

@Repository
public interface RegistrationSmePDRepository extends JpaRepository<RegistrationSmePDDaoEntity, Integer>{

}
