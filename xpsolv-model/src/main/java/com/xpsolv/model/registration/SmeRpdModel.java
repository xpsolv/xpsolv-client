package com.xpsolv.model.registration;

import org.springframework.stereotype.Component;

@Component
public class SmeRpdModel {

	private String smeFirstName;
	private String smeSurName;
	private int smePhone;
	private String smeCountryCode;
	private String smeEmailId;
	private String smeCountry;

	// Generate getters and setters

	public String getSmeFirstName() {
		return smeFirstName;
	}

	public void setSmeFirstName(String smeFirstName) {
		this.smeFirstName = smeFirstName;
	}

	public String getSmeSurName() {
		return smeSurName;
	}

	public void setSmeSurName(String smeSurName) {
		this.smeSurName = smeSurName;
	}

	public int getSmePhone() {
		return smePhone;
	}

	public void setSmePhone(int smePhone) {
		this.smePhone = smePhone;
	}

	public String getSmeCountryCode() {
		return smeCountryCode;
	}

	public void setSmeCountryCode(String smeCountryCode) {
		this.smeCountryCode = smeCountryCode;
	}

	public String getSmeEmailId() {
		return smeEmailId;
	}

	public void setSmeEmailId(String smeEmailId) {
		this.smeEmailId = smeEmailId;
	}

	public String getSmeCountry() {
		return smeCountry;
	}

	public void setSmeCountry(String smeCountry) {
		this.smeCountry = smeCountry;
	}

}
