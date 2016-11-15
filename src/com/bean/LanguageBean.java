package com.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.google.gson.Gson;
import com.model.Language;

@ManagedBean
@SessionScoped
public class LanguageBean {

	private List<Language> languages;

	private String jsonString;

	public LanguageBean() {
		languages = new ArrayList<>();
		Language language = new Language("Husnu", 5000, "#7F8DA9", "https://www.amcharts.com/lib/images/faces/A04.png");
		Language language1 = new Language("Husnu1", 6000, "#7F8DA9",
				"https://www.amcharts.com/lib/images/faces/A04.png");
		Language language2 = new Language("Husnu2", 7000, "#7F8DA9",
				"https://www.amcharts.com/lib/images/faces/A04.png");
		Language language3 = new Language("Husnu3", 8000, "#7F8DA9",
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
