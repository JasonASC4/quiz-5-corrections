public class Employees{
	public String firstName;
	public String lastName;
	public int salary;
	public String department;
	
	public Employees(String firstName, String lastName, String department, int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.department = department;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getSalary() {
		return salary;
	}
	public String getDepartment() {
		return department;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setSalary (int salary) {
		this.salary = salary;
	}
	public void setDepartment (String department) {
		this.department = department;
	}
  
  @Override
	public String toString()	{
		return "{ Name: " first_Name + " " + last_Name + ", Salary: " + salary + ", Department: " + department "}";
	}
}
