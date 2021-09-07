package com.belhard.lesson4.classes;

public class Cleaner extends Employee {

	public Cleaner cleaner;

	int room;

	public Cleaner(String firstName, String lastName, int room) {
		super(firstName, lastName);
	}

	public String toString() {
		return "Cleaner: -> id - " + getId() + "Name - " + getFirstName() + " " + getLastName();

	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}
}