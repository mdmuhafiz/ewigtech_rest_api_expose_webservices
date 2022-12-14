package com.ewigtech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "letsworktogether")
public class LetsWorkTogether {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "name",length = 45,nullable = false)
	private String name;
	@Column(name = "email",length = 128,nullable = false,unique = true)
	private String email;
	
	private String anythingSpecific;
	@Column(name = "how_can_i_help_you",length = 256,nullable = false)
	private String howCanIHelpYou;
	public LetsWorkTogether() {
		
	}
	
	public LetsWorkTogether(String name, String email, String anythingSpecific, String howCanIHelpYou) {
		
		this.name = name;
		this.email = email;
		this.anythingSpecific = anythingSpecific;
		this.howCanIHelpYou = howCanIHelpYou;
	}

	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getAnythingSpecific() {
		return anythingSpecific;
	}
	public String getHowCanIHelpYou() {
		return howCanIHelpYou;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAnythingSpecific(String anythingSpecific) {
		this.anythingSpecific = anythingSpecific;
	}
	public void setHowCanIHelpYou(String howCanIHelpYou) {
		this.howCanIHelpYou = howCanIHelpYou;
	}
	

}
