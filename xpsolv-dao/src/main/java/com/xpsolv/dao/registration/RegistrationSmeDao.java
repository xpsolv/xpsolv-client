package com.xpsolv.dao.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xpsolv.dao.entity.RegistrationSmePDDaoEntity;
import com.xpsolv.dao.repositories.RegistrationSmePDRepository;
import com.xpsolv.model.registration.SmeRpdModel;

@Service
public class RegistrationSmeDao {

	@Autowired
	RegistrationSmePDRepository registrationSmePDRepository;
	

	public SmeRpdModel registerSmePd(RegistrationSmePDDaoEntity registrationSmePDDaoEntity) {

		System.out.println(registrationSmePDDaoEntity);
		SmeRpdModel smeModel = new SmeRpdModel();
		RegistrationSmePDDaoEntity updateRegisterSme = registrationSmePDRepository.save(registrationSmePDDaoEntity);
		smeModel.setSmeFirstName(updateRegisterSme.getSmeFirstName());
		smeModel.setSmeCountry(updateRegisterSme.getSmeCountry());
		smeModel.setSmePhone(updateRegisterSme.getSmePhone());
		return smeModel;
	}

}
