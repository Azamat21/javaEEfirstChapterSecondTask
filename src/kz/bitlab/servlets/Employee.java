package kz.bitlab.servlets;

public class Employee {
    protected String name;
    protected String surname;
    protected String department;
    protected int salary;
    public Employee(){

    }
    public Employee(String name,String surname,String department,int salary){
        this.name  = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
