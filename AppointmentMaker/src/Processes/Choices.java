package Processes;

import Appointment.RunAppointment;

public class Choices extends RunAppointment {

	public static void display() {
		System.out.println("Which of the following would you like to do?:");
		System.out.println("1: Create a new appointment");
		System.out.println("2: Check if you have any appointments on a certain date?");
	}
}
