package entities.concretes;

public class user {
  private String firstname;
  private String lastName;
  private String email;
  private String password;
public user(String firstname, String lastName, String email, String password) {
	super();
	this.firstname = firstname;
	this.lastName = lastName;
	this.email = email;
	this.password = password;
}
public user() {
	
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


  
}
