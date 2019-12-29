package com.xpsolv.business.layer.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xpsolv.dao.entity.RegistrationSmePDDaoEntity;
import com.xpsolv.dao.registration.RegistrationSmeDao;
import com.xpsolv.model.registration.SmeRpdModel;

@Service
public class RegistrationSmeProcess {

	@Autowired
	RegistrationSmeDao registrationUserDao;
	@Autowired
	RegistrationSmePDDaoEntity registrationSmePDDaoEntity;

	public SmeRpdModel registerSmePd(SmeRpdModel smeRegistrationPdModel) {

		System.out.println(smeRegistrationPdModel);
		registrationSmePDDaoEntity.setSmeFirstName(smeRegistrationPdModel.getSmeFirstName());
		registrationSmePDDaoEntity.setSmeSurName(smeRegistrationPdModel.getSmeSurName());
		registrationSmePDDaoEntity.setSmeEmailId(smeRegistrationPdModel.getSmeEmailId());
		registrationSmePDDaoEntity.setSmeCountryCode(smeRegistrationPdModel.getSmeCountryCode());
		registrationSmePDDaoEntity.setSmeCountry(smeRegistrationPdModel.getSmeCountry());
		registrationSmePDDaoEntity.setSmePhone(smeRegistrationPdModel.getSmePhone());

		return registrationUserDao.registerSmePd(registrationSmePDDaoEntity);

	}
}
