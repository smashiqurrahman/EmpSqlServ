package model;

public class Employee {
	
	private String id;
	private String name;
	private String age;
	private String salary;
	private String email;
	private String address;
	
	public Employee(String id, String name, String age, String salary, String email, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.email = email;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", email=" + email
				+ ", address=" + address + "]";
	}
	
	

}
