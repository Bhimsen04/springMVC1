package com.bhimsen;

//POJO or Model or Bean
public class Employee {

	// Attributes
	int eid;
	String ename;
	double esalary;
	Address address;

	public Employee() {
		System.out.println("Employee object constructed");
	}

	// Constructor injection
	public Employee(Address address) {
		this.address = address;
	}

	public Employee(int eid, String ename, double esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}

	public Address getAddress() {
		return address;
	}

	// Setter injection
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", address=" + address + "]";
	}

}
