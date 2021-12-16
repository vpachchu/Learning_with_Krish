package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // We are going to consider the ticket raising at our Company. Based on priority of risk.

        ITTeam itTeam=new ITTeam();
        Technician technician=new Technician();
        CloudTeam cloudTeam= new CloudTeam();

        //name can change. keep name out of the logic. not comes under this Design pattern. it just a trick.
        LowLevel lowLevel=new LowLevel();

        lowLevel.setSuccessor(itTeam);
        itTeam.setSuccessor(technician);
        technician.setSuccessor(cloudTeam);

        Priority priority1=new Priority(3);
        System.out.println("I'm priority "+lowLevel.applyPriority(priority1));

        Priority priority2=new Priority(2);
        System.out.println("I'm priority "+lowLevel.applyPriority(priority2));

        Priority priority3=new Priority(1);
        System.out.println("I'm priority "+lowLevel.applyPriority(priority3));


    }
}
