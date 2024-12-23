package com.example.demo.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class UserRole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userRoleid;
	private String roleName;
	
	@ManyToMany(mappedBy = "roles")
	private List<User> users;

	public UserRole() {
		super();
	}

	public UserRole(int userRoleid, String roleName, List<User> users) {
		super();
		this.userRoleid = userRoleid;
		this.roleName = roleName;
		this.users = users;
	}

	public int getUserRoleid() {
		return userRoleid;
	}

	public void setUserRoleid(int userRoleid) {
		this.userRoleid = userRoleid;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
