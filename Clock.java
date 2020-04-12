package com.company.training.object.time.bean;

/* Составьте описание класса для представления времени. Предусмотрите возможности установки времени и изменения его отдельных полей 
 (час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0. 
 Создать методы изменения времени на заданное количество часов, минут и секунд.
 * 
 */

public class Clock {

	private int hours;
	private int minutes;
	private int seconds;
	

	public void setMinutes(int minutes) {
		if (minutes >= 0 && minutes <= 60) {
			this.minutes = minutes;
		} else {
			this.minutes = 0;
		}
	}

	public void setHours(int hours) {
		if (hours >= 0 && hours <= 24) {
			this.hours = hours;
		} else {
			this.hours = 0;
		}

	}
	
	public void setSeconds(int seconds) {
		if(seconds >= 0 && seconds <= 60) {
			this.seconds = seconds;
		}
		else {
			this.seconds = 0;
		}
	}
	
	public int getHours() {
		return hours;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public int getSeconds() {
		return seconds;
	}

}
