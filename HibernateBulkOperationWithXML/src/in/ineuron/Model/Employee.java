package in.ineuron.Model;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer eno;
	

	private String ename;
	
	private String eaddr;
	
	private Integer esalary;

	

	@Override
	public String toString() {
		System.out.println("Employee.toString()");
		return "Employee [eno=" + eno + ", ename=" + ename + ", eaddr=" + eaddr + ", esalary=" + esalary + "]";
	}



	public Integer getEno() {
		System.out.println("Employee.getEno()");
		return eno;
	}



	public void setEno(Integer eno) {
		System.out.println("Employee.setEno()");
		this.eno = eno;
	}



	public String getEname() {
		System.out.println("Employee.getEname()");
		return ename;
	}



	public void setEname(String ename) {
		System.out.println("Employee.setEname()");
		this.ename = ename;
	}



	public String getEaddr() {
		System.out.println("Employee.getEaddr()");
		return eaddr;
	}



	public void setEaddr(String eaddr) {
		System.out.println("Employee.setEaddr()");
		this.eaddr = eaddr;
	}



	public Integer getEsalary() {
		System.out.println("Employee.getEsalary()");
		return esalary;
	}



	public void setEsalary(Integer esalary) {
		System.out.println("Employee.setEsalary()");
		this.esalary = esalary;
	}
	
	

}