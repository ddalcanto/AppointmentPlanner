package Processes;

import Appointment.RunAppointment;
import AppointmentDate.Monthly;
import AppointmentDate.Onetime;

public class CheckDates extends RunAppointment {

	private static int times = 0;

	public static void display() {

		while (isRun == true) {
			if (times == 0) {
				times++;
			}

			System.out.println("What day would you like to check for appointments?");

			m1 = new Monthly(type, doctor, year, month, day);
			o1 = new Onetime(type, doctor, year, month, day);

			System.out.println("Enter year: ");
			year = in.nextInt();
			System.out.println("Enter month: ");
			month = in.nextInt();
			System.out.println("Enter day: ");
			day = in.nextInt();

			checkDate();

			if (times >= 1) {
				System.out.println();
				System.out.println();

				System.out.println("Would you like to check another date for appointments?");
				System.out.println("y/n?");

				continueCreate = in.next();
				times--;
				if (continueCreate.equals("n")) {
					isRun = false;
				}
			}

		}

	}

	public static void checkDate() {

		if (frequency.equals("m")) {
			m1.occursOn(year, month, day);
		}

		if (frequency.equals("o")) {
			o1.occursOn(year, month, day);
		}
	}
}
