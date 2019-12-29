package com.xpsolv.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "registersmepd", catalog = "xpsolv")
public class RegistrationSmePDDaoEntity {
	
	@Id
	@Column(name = "id")
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
	@Column(name = "smeFirstName")
	private String smeFirstName;
	@Column(name = "smeSurName")
	private String smeSurName;
	@Column(name = "smePhone")
	private int smePhone;
	@Column(name = "smeCountryCode")
	private String smeCountryCode;
	@Column(name = "smeEmailId")
	private String smeEmailId;
	@Column(name = "smeCountry")
	private String smeCountry;
	
	//Generate getters and setters
	
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
	
	@Override
	public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("First name : ").append(this.smeFirstName).append("\n");
        sb.append("Sur name : ").append(this.smeSurName).append("\n");
        sb.append("Email : ").append(this.smeEmailId).append("\n");
        sb.append("Phone : ").append(this.smePhone).append("\n");
        sb.append("Country Code : ").append(this.smeCountryCode).append("\n");
        sb.append("Country : ").append(this.smeCountry).append("\n");
        return sb.toString();
    }

	

}
