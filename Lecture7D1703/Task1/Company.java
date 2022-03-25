package Lecture7D1703.Task1;

public class Company {
    private String name;
    private Employee[] employees;

    public Company(){
        employees = new Employee[5];
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee){
        addEmployee(employee, employees);
    }

    public void addEmployee(Employee employee, Employee[] empl){
        for (int i = 0; i < empl.length; i++) {
            if(empl[i]==null){
                empl[i]=employee;
                break;
            }
        }
    }

    public Employee[] employeesFromTeam(String team){
        Employee[] toReturn = new Employee[5];

        for (int i = 0; i < employees.length; i++) {
            if(employees[i]!=null && employees[i].getTeam()==team){
                addEmployee(employees[i], toReturn);
            }
        }
        return toReturn;
    }


}
