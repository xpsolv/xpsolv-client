package com.xpsolv.controller.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xpsolv.business.layer.registration.RegistrationUser;
import com.xpsolv.model.registration.ActorRpdModel;

@RestController
@RequestMapping("/registration")
public class RegistrationUserController {

	@Autowired
	RegistrationUser registrationUser;
		
	@PostMapping("/actor")
	public String registerUser(@RequestBody final ActorRpdModel actorRpdModel) {

		/*
		 * RegistrationUser registrationUser = new RegistrationUser();
		 * RegistrationUserModel registerUser = new RegistrationUserModel();
		 * System.out.println(registrationModel);
		 * registerUser.setFirstName(registrationModel.getFirstName());
		 * registerUser.setLastName(registrationModel.getLastName());
		 * registerUser.setEmail(registrationModel.getEmail());
		 */
		return registrationUser.registerUser(actorRpdModel);
	
	}

}
