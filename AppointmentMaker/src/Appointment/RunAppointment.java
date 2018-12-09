package Appointment;

import java.util.Scanner;

import AppointmentDate.Monthly;
import AppointmentDate.Onetime;
import Processes.CheckDates;
import Processes.Choices;
import Processes.CreateAppointment;

public class RunAppointment {

	public static int year;
	public static int month;
	public static int day;

	public static String type = "dentist";
	public static String doctor = type;
	public static String frequency;
	private static int mode;

	public static int times;
	public static String continueCreate;
	private static boolean newCreate;
	public static boolean isRun;

	public static Appointment a1;
	public static Monthly m1;
	public static Onetime o1;

	public static Scanner in = new Scanner(System.in);

	public void program() {
		continueCreate = "y";
		isRun = false;
		newCreate = true;
		times = 0;
		while (newCreate == true) {
			while (isRun == false) {
				Choices.display();

				mode = in.nextInt();
				isRun = true;
			}

			switch (mode) {
			case 1:

				if (continueCreate.equals("y")) {

					CreateAppointment.display();
					continueCreate = in.next();

				} else if (continueCreate.equals("n")) {

					isRun = false;
					continueCreate = "y";

				}
				break;

			case 2:

				if (continueCreate.equals("y")) {

					CheckDates.display();

				} else if (continueCreate.equals("n")) {

					isRun = false;
					times = 0;
//					continueCreate = "y";
				}

				break;
			default:
				System.out.println("ERROR: 'MODE' DEFAULT RAN");
			}
		}
		in.close();

	}
}
