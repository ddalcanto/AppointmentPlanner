package AppointmentDate;

import Appointment.Appointment;

public class Monthly extends Appointment {
	Appointment a1;

	public Monthly(String type, String doctor, int year, int month, int day) {
		super(type, doctor, year, month, day);
		a1 = new Appointment(type, doctor, year, month, day);
		super.occursOn(year, month, day);

	}

	public void occursOn(int year, int month, int day) {

//		getApp();
		for (Appointment test : appointments) {

			System.out.println("Checked Date: " + day);
			System.out.println("Appointment Date: " + test.getDay());

			if (test.getDay() == day) {
				System.out.println("You DO have a Monthly appointment on " + getDate());

			} else {
				System.out.println("You DON'T have a Monthly appointment on " + getDate());
			}
		}

	}
}
