package org.pursuit;

public class Gradechecker {

    public void printNameandGrade(Fellow fellow ){
        System.out.println(fellow.getName() + " from " + fellow.getCohort() +
                " has earned " + fellow.getGrade() +
                " in class ");

    }
}
