package main.entities;

public class Employee {

	private String empID;
	private String empName;

	public Employee()	{	}
	public Employee(String empID, String empName) {
		this.empID = empID;
		this.empName = empName;
	}


	public void setEmpName(String empName)	{	this.empName = empName;	}
	public void setEmpID(String empID)		{	this.empID = empID;		}

	public String getEmpName()	{	return empName;	}
	public String getEmpID() 	{	return empID;	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + "]";
	}
}
