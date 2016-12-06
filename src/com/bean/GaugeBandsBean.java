package com.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.google.gson.Gson;
import com.model.GaugeBand;
import com.otherUtility.ColorHexCode;

@ManagedBean
@SessionScoped
public class GaugeBandsBean {

	private String jsonString;
	private List<GaugeBand> gaugeBands = new ArrayList<>();

	public GaugeBandsBean() {
		GaugeBand band = new GaugeBand(1, ColorHexCode.hexCodes.get("Gray"), 0, 100, "Band one", "85%", "100%");
		GaugeBand band2 = new GaugeBand(2, ColorHexCode.hexCodes.get("Blue"), 0, 0, "Band two", "85%", "100%");
		GaugeBand band3 = new GaugeBand(3, ColorHexCode.hexCodes.get("Green"), 0, 100, "Band three", "65%", "80%");
		GaugeBand band4 = new GaugeBand(4, ColorHexCode.hexCodes.get("Orange"), 0, 100, "Band four", "65%", "80%");

		gaugeBands.add(band);
		gaugeBands.add(band2);
		gaugeBands.add(band3);
		gaugeBands.add(band4);

		Gson gson = new Gson();
		jsonString = gson.toJson(gaugeBands);
	}

	public String getJsonString() {
		return jsonString;
	}

}
