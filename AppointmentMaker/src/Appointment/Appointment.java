package Appointment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Appointment {

	public LocalDate appDate, aMonth, mDay;

	private String description, type, doctor;

	private int year, month, day;

	public ArrayList<Appointment> appointments = new ArrayList<Appointment>();

	public Appointment(String type, String doctor, int year, int month, int day) {
		this.type = type;
		this.doctor = doctor;
		this.year = year;
		this.month = month;
		this.day = day;

	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public String Doctor() { // Randomly selects the doctors name
		Random random = new Random();
		int select = random.nextInt(3) + 1;
		System.out.println("Random int: " + select);
		if (doctor.equals("dentist")) {
			switch (select) {
			case 1:
				doctor = "Dr. Root";
				break;
			case 2:
				doctor = "Dr. Toothache";
				break;
			case 3:
				doctor = "Dr. Pick";
				break;
			default:
				doctor = "ERROR OCCURED WITH 'RANDOM INT' IN DOCTOR";
				break;

			}
		}
		return doctor;
	}

	public String getDate() {

		appDate = LocalDate.of(year, month, day);

		return appDate.getMonth() + "/" + appDate.getDayOfMonth() + "TH/" + appDate.getYear();
	}

	public ArrayList<Appointment> getApp() {

		getDate();

		appointments.add(new Appointment(type, doctor, year, month, day));

		return appointments;
	}

	public void display() {

		System.out.print("Your appointment will be a " + type + "'s appointment with " + Doctor()); // + date
	}

	public String toString() {
		return Integer.toString(this.year + this.day);
	}

	@SuppressWarnings("unused")
	public void occursOn(int year, int month, int day) {

		getApp();

	}

}
