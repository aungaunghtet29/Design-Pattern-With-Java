package builder.pattern;

public class Employee_Builder {
	private Employee employee;

	public Employee_Builder createEmployee() {
		employee = new Employee();
		return this;
	}

	public Employee_Builder addEmployeeId(String id) {
		employee.setEmployeeId(id);
		return this;
	}

	public Employee_Builder addEmployeeName(String name) {
		employee.setName(name);
		return this;
	}

	public Employee_Builder addEmployeeDepartment(String department) {
		employee.setDepartment(department);
		return this;
	}

	public Employee_Builder addEmployeeSalary(double salary) {
		employee.setSalary(salary);
		return this;
	}

	public Employee_Builder addEmployeeState(String state) {
		employee.setState(state);
		return this;
	}

	public Employee_Builder addEmployeeProvince(String province) {
		employee.setProvince(province);
		return this;
	}

	public Employee build() {
		return employee;
	}

	@Override
	public String toString() {
		return "Employee_Builder [employee=" + employee + "]";
	}
	
}
