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
@Table(name = "registeractorpd", catalog = "xpsolv")
public class RegistrationActorEntity {
	
	@Id
	@Column(name = "id")
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
	@Column(name = "actorFirstName")
	private String actorFirstName;
	@Column(name = "actorSurName")
	private String actorSurName;
	@Column(name = "actorPhone")
	private int actorPhone;
	@Column(name = "actorCountryCode")
	private String actorCountryCode;
	@Column(name = "actorEmailId")
	private String actorEmailId;
	@Column(name = "actorCountry")
	private String actorCountry;
	
	//Generate getters and setters


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActorFirstName() {
		return actorFirstName;
	}

	public void setActorFirstName(String actorFirstName) {
		this.actorFirstName = actorFirstName;
	}

	public String getActorSurName() {
		return actorSurName;
	}

	public void setActorSurName(String actorSurName) {
		this.actorSurName = actorSurName;
	}

	public int getActorPhone() {
		return actorPhone;
	}

	public void setActorPhone(int actorPhone) {
		this.actorPhone = actorPhone;
	}

	public String getActorCountryCode() {
		return actorCountryCode;
	}

	public void setActorCountryCode(String actorCountryCode) {
		this.actorCountryCode = actorCountryCode;
	}

	public String getActorEmailId() {
		return actorEmailId;
	}

	public void setActorEmailId(String actorEmailId) {
		this.actorEmailId = actorEmailId;
	}

	public String getActorCountry() {
		return actorCountry;
	}

	public void setActorCountry(String actorCountry) {
		this.actorCountry = actorCountry;
	}

	@Override
	public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("First name : ").append(this.actorFirstName).append("\n");
        sb.append("Sur name : ").append(this.actorSurName).append("\n");
        sb.append("Email : ").append(this.actorEmailId).append("\n");
        sb.append("Phone : ").append(this.actorPhone).append("\n");
        sb.append("Country Code : ").append(this.actorCountryCode).append("\n");
        sb.append("Country : ").append(this.actorCountry).append("\n");
        return sb.toString();
    }

}
