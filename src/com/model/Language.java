package com.model;

public class Language {
	private String name;
	private int points;
	private String color;
	private String bullet;
	
	public Language() {
		// TODO Auto-generated constructor stub
	}

	public Language(String name, int points, String color, String bullet) {
		this.name = name;
		this.points = points;
		this.color = color;
		this.bullet = bullet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBullet() {
		return bullet;
	}

	public void setBullet(String bullet) {
		this.bullet = bullet;
	}
	
	

}
