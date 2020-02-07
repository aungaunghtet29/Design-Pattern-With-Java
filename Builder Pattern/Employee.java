package builder.pattern;

public class Employee {
	private String employeeId;
	private String name;
	private String department;
	private double salary;
	private String state;
	private String province;

	public Employee() {
		
	}
	public Employee(String employeeId, String name, String department, double salary, String state, String province) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.state = state;
		this.province = province;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", department=" + department + ", salary="
				+ salary + ", state=" + state + ", province=" + province + "]";
	}

}
