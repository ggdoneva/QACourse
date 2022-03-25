package Lecture7D1703.Task1;

public class Employee {
    private String team;
    private int salary;
    private String name;

    public Employee(String team, int salary, String name){
        this.team = team;
        this.salary = salary;
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "team='" + team + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
