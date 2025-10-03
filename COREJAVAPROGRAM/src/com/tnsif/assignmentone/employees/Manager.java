package com.tnsif.assignmentone.employees;

/**
 * Represents a Manager, which is a specialized type of Employee.
 */
public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, String employeeId, double salary, int teamSize) {
        super(name, employeeId, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Team Size: " + teamSize);
    }
}