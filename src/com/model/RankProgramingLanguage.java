package com.model;

import java.io.Serializable;

public class RankProgramingLanguage implements Serializable {

	private int id;
	private String language;
	private double beforeYear;
	private double lastYear;

	public RankProgramingLanguage() {
		// TODO Auto-generated constructor stub
	}

	public RankProgramingLanguage(int id, String language, double beforeYear, double lastYear) {
		super();
		this.id = id;
		this.language = language;
		this.beforeYear = beforeYear;
		this.lastYear = lastYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getBeforeYear() {
		return beforeYear;
	}

	public void setBeforeYear(double beforeYear) {
		this.beforeYear = beforeYear;
	}

	public double getLastYear() {
		return lastYear;
	}

	public void setLastYear(double lastYear) {
		this.lastYear = lastYear;
	}

}
