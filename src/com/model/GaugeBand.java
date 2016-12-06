package com.model;

public class GaugeBand {

	private int id;
	
	private String color;
	private int startValue;
	private int endValue;
	private String balloonText;
	private String innerRadius;
	
	private String radius;
	
	

	public GaugeBand() {
	}

	public GaugeBand(int id, String color, int startValue, int endValue, String balloonText, String innerRadius,String radius) {
		this.id = id;
		this.color = color;
		this.startValue = startValue;
		this.endValue = endValue;
		this.balloonText = balloonText;
		this.innerRadius = innerRadius;
		this.radius = radius;
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

	public int getStartValue() {
		return startValue;
	}

	public void setStartValue(int startValue) {
		this.startValue = startValue;
	}

	public int getEndValue() {
		return endValue;
	}

	public void setEndValue(int endValue) {
		this.endValue = endValue;
	}

	public String getBalloonText() {
		return balloonText;
	}

	public void setBalloonText(String balloonText) {
		this.balloonText = balloonText;
	}

	public String getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(String innerRadius) {
		this.innerRadius = innerRadius;
	}

	public String getRadius() {
		return radius;
	}

	public void setRadius(String radius) {
		this.radius = radius;
	}
	

}
