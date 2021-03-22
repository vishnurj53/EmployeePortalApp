
package main.java.org.employeePortal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * This is our model class and it corresponds to Customer table in database
 */
@Entity
@Table(name="EMPLOYEE")
public class Employee{

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;

	@Column(name="employeeName")
	String employeeName; 

	@Column(name="email")
	String email;
	
	@Column(name="rating")
	String rating;
	
	@Column(name="department")
	String department;

	public Employee() {
		super();
	}
	public Employee(String employeeName,String email, String rating, String department) {
		super();
		this.employeeName = employeeName;
		this.email = email;
		this.rating = rating;
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}	
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
