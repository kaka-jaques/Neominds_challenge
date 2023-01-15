package br.com.challenge.neomind.object;

public class Relogio {

	private int hour;
	private int minute;
	
	public Relogio() {
		super();
	}

	public Relogio(int hour, int minute) {
		super();
		this.hour = hour;
		this.minute = minute;
	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
}
