package com.workintech.developers;

public class HRManager extends Employee{

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("HR Manager starts working.");
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper) {
        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("index doesn't exist");
            return;
        }
        if(juniorDevelopers[index] == null) juniorDevelopers[index] = juniorDeveloper;
        else System.out.println("the index is not empty.");
    }

    public void addEmployee(int index, MidDeveloper midDeveloper) {
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("index doesn't exist");
            return;
        }
        if(midDevelopers[index] == null) midDevelopers[index] = midDeveloper;
        else System.out.println("the index is not empty.");
    }

    public void addEmployee(int index, SeniorDeveloper seniorDeveloper) {
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("index doesn't exist");
            return;
        }
        if(seniorDevelopers[index] == null) seniorDevelopers[index] = seniorDeveloper;
        else System.out.println("the index is not empty.");
    }
}
