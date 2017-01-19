package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column(name = "name", length = 100)
	private String name;
	
	@Column(name = "email", length = 100)
	private String email;
	
	@Column(name = "pass", length = 6)
	private String pass;
	
	@Column(name = "passConfirm", length = 6)
	private String passConfirm;
	
	public String getPassConfirm() {
        return passConfirm;
    }
    public void setPassConfirm(String passConfirm) {
        this.passConfirm = passConfirm;
    }
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
