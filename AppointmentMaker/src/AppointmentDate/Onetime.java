package AppointmentDate;

import Appointment.Appointment;

public class Onetime extends Appointment {
	Appointment a1;

	public Onetime(String type, String doctor, int year, int month, int day) {
		super(type, doctor, year, month, day);
		a1 = new Appointment(type, doctor, year, month, day);
		super.occursOn(year, month, day);

	}

	public void occursOn(int year, int month, int day) {

		for (Appointment test : appointments) {

			if (test.getYear() == year && test.getMonth() == month && test.getDay() == day) {
				System.out.println("You DO have a one time appointment on " + getDate());

			} else {
				System.out.println("You DON'T have a one time appointment on " + getDate());
			}
		}

	}
}
