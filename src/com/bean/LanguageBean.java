package com.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.google.gson.Gson;
import com.model.Language;
import com.otherUtility.ColorHexCode;

@ManagedBean
@SessionScoped
public class LanguageBean {

	private List<Language> languages;

	private String jsonString;

	public LanguageBean() {


		System.out.println("color:" + ColorHexCode.hexCodes.get("Gray"));

		languages = new ArrayList<>();
		Language language = new Language("Husnu TAPAN", 5000, ColorHexCode.hexCodes.get("Gray"),
				"https://www.amcharts.com/lib/images/faces/A04.png");
		Language language1 = new Language("Enes ISMAILOGLU", 6000, ColorHexCode.hexCodes.get("Red"),
				"https://www.amcharts.com/lib/images/faces/A04.png");
		Language language2 = new Language("Mehmet KERSE", 7000, ColorHexCode.hexCodes.get("Green"),
				"https://www.amcharts.com/lib/images/faces/A04.png");
		Language language3 = new Language("Oguzhan YILMAZ", 8000, ColorHexCode.hexCodes.get("Blue"),
				"https://www.amcharts.com/lib/images/faces/A04.png");

		languages.add(language);
		languages.add(language1);
		languages.add(language2);
		languages.add(language3);

		Gson gson = new Gson();
		jsonString = gson.toJson(languages);

	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	public String getJsonString() {
		return jsonString;
	}

	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}

}
