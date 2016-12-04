package com.model;

import java.io.Serializable;

public class Gauge1 implements Serializable {
	private int id;
	private String color;
	private int endValue;
	private int startValue;

	public Gauge1() {
	}

	public Gauge1(int id, String color, int endValue, int startValue) {
		this.id = id;
		this.color = color;
		this.endValue = endValue;
		this.startValue = startValue;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getEndValue() {
		return endValue;
	}

	public void setEndValue(int endValue) {
		this.endValue = endValue;
	}

	public int getStartValue() {
		return startValue;
	}

	public void setStartValue(int startValue) {
		this.startValue = startValue;
	}

}
