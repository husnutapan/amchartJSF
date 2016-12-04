package com.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import com.google.gson.Gson;
import com.model.Gauge1;
import com.otherUtility.ColorHexCode;

@ManagedBean
@ViewScoped
public class GaugeBean2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Gauge1> gaugeList = new ArrayList<>();

	private String jsonData = new String();

	private int speed;

	public GaugeBean2() {
		Gauge1 gauge1 = new Gauge1(1, ColorHexCode.hexCodes.get("Gray"), 90, 0);
		Gauge1 gauge2 = new Gauge1(2, ColorHexCode.hexCodes.get("Red"), 130, 90);
		Gauge1 gauge3 = new Gauge1(3, ColorHexCode.hexCodes.get("Blue"), 180, 130);
		Gauge1 gauge4 = new Gauge1(4, ColorHexCode.hexCodes.get("Green"), 220, 180);

		gaugeList.add(gauge1);
		gaugeList.add(gauge2);
		gaugeList.add(gauge3);
		gaugeList.add(gauge4);

		Gson gson = new Gson();
		jsonData = gson.toJson(gaugeList);
	}

	public int getSpeed() {
		speed = (int) (Math.random() * 150);
		return speed;
	}

	public List<Gauge1> getGaugeList() {
		return gaugeList;
	}

	public String getJsonData() {
		return jsonData;
	}
}
