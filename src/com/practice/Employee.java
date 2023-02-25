package com.practice;

public class Employee {

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    private Integer id;
    private String name;
    private Long salary;

    public Integer getId() {
        return id;
    }


    public Employee(Integer id, String name, Long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }


}
