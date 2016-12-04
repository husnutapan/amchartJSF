package com.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.google.gson.Gson;
import com.model.Gauge1;
import com.otherUtility.ColorHexCode;

@ManagedBean
@SessionScoped
public class GaugeBean1 {

	private List<Gauge1> gaugeList = new ArrayList<>();
	
	private String jsonData= new String();
	
	

	public GaugeBean1() {
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

	public List<Gauge1> getGaugeList() {
		return gaugeList;
	}

	public String getJsonData() {
		return jsonData;
	}

}
