package com.xpsolv.controller.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xpsolv.business.layer.registration.RegistrationSmeProcess;
import com.xpsolv.model.registration.SmeRpdModel;

@RestController
@RequestMapping("/registration")
public class RegistrationSmeController {

	@Autowired
	RegistrationSmeProcess registrationSmeProcess;

	@PostMapping("/smepd")
	public String registerSmePersonalDetails(@RequestBody final SmeRpdModel smeRegistrationPdModel) {

		System.out.println(smeRegistrationPdModel.getSmeFirstName());
		/*
		 * smeRegistrationPdModel.setSmeFirstName(registrationSmePDModel.getSmeFirstName
		 * ());
		 * smeRegistrationPdModel.setSmeSurName(registrationSmePDModel.getSmeSurName());
		 * smeRegistrationPdModel.setSmeEmailId(registrationSmePDModel.getSmeEmailId());
		 * smeRegistrationPdModel.setSmeCountryCode(registrationSmePDModel.
		 * getSmeCountryCode());
		 * smeRegistrationPdModel.setSmePhone(registrationSmePDModel.getSmePhone());
		 * smeRegistrationPdModel.setSmeCountry(registrationSmePDModel.getSmeCountry());
		 */

		return registrationSmeProcess.registerSmePd(smeRegistrationPdModel);
	}

}
