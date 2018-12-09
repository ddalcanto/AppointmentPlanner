package AppointmentType;

import Appointment.Appointment;

public class DentistApp extends Appointment {

	Appointment a1;

	public DentistApp(String type, String doctor, int year, int month, int day) {
		super(type, doctor, year, month, day);
		a1 = new Appointment(type, doctor, year, month, day);
	}

	public void display() {
		super.display();

	}
}
