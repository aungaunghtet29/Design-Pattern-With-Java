package builder.pattern;

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee("1","Aung Aung", "IT", 200000,"Yangon","Tharkayta");
		System.out.println(employee);
		Employee_Builder empBuilder = new Employee_Builder();
		empBuilder.createEmployee().addEmployeeId("1").addEmployeeSalary(300000).addEmployeeDepartment("IT").addEmployeeName("Aung Aung").build();
		System.out.println(empBuilder);
	}
}
