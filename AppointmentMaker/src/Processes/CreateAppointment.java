package Processes;

import Appointment.RunAppointment;

public class CreateAppointment extends RunAppointment {

	public static void createAppointment() {

	}

	public static void display() {
		appType();
		appDate();
		System.out.println("Would you like to create another appointment?");
		System.out.println("y/n?");
	}
	
	private static void appType() {
		System.out.println("Would you like to schedule a reaccuring (m)onthly appointment, or a (o)ne time appointment?");
		frequency = in.next();
	}
	
	private static void appDate() {
		
		System.out.println("Enter year: ");
		year = in.nextInt();
		System.out.println("Enter month: ");
		month = in.nextInt();
		System.out.println("Enter day: ");
		day = in.nextInt();
		
	}
}
