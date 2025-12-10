package com.boot.comp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="empl.info")
public class Employee {
	
	private String name;
	private long id;
	private String[] skills;
	private List<String> teamMember;
	private Set<Long> phoneNumber;
	private Map<String,Object> idDetails;
	private Company company;
	
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Map<String, Object> getIdDetails() {
		return idDetails;
	}
	public void setIdDetails(Map<String, Object> idDetails) {
		this.idDetails = idDetails;
	}
	public Set<Long> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Set<Long> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<String> getTeamMember() {
		return teamMember;
	}
	public void setTeamMember(List<String> teamMember) {
		this.teamMember = teamMember;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", skills=" + Arrays.toString(skills) + ", teamMember="
				+ teamMember + ", phoneNumber=" + phoneNumber + ", idDetails=" + idDetails + ", company=" + company
				+ "]";
	}
	
	
	
}
