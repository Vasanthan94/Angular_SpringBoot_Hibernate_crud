package spring.hiber.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserDetails")
public class UserEntity 
{
	@Column(name="Fname")
	private String fname;
	@Column(name="Lname")
	private String lname;
	@Id
	@Column(name="Email")
	private String email;
	@Column(name="Date_Of_Birth")
	private String dob;
	@Column(name="Phone_1")
	private long phone1;
	@Column(name="Phone_2")
	private long phone2;
	@Column(name="Address")
	private String address;
	@Column(name="Experience")
	private String experience;

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getPhone1() {
		return phone1;
	}
	public void setPhone1(long phone1) {
		this.phone1 = phone1;
	}
	public long getPhone2() {
		return phone2;
	}
	public void setPhone2(long phone2) {
		this.phone2 = phone2;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	@Override
	public String toString() {
		return "UserEntity [fname=" + fname + ", lname=" + lname + 
				", email=" + email + ", dob=" + dob + ", phone1="
				+ phone1 + ", phone2=" + phone2 + ", address=" + address +
				", experience=" + experience +  "]";
	}
	
}