package com.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.google.gson.Gson;
import com.model.RankProgramingLanguage;

@ManagedBean
@ViewScoped
public class RankProgramingLanguageBean implements Serializable {
	private List<RankProgramingLanguage> rankProgramingLanguages;
	
	
	private String jsonData;

	public RankProgramingLanguageBean() {
		rankProgramingLanguages = new ArrayList<>();

		RankProgramingLanguage java = new RankProgramingLanguage(1, "JAVA", 20.0, 21.0);
		RankProgramingLanguage php = new RankProgramingLanguage(1, "PHP", 17.0, 13.0);
		RankProgramingLanguage ruby = new RankProgramingLanguage(1, "RUBY", 4.0, 5.0);
		RankProgramingLanguage phyton = new RankProgramingLanguage(1, "PHYTON", 6.0, 8.0);
		RankProgramingLanguage c = new RankProgramingLanguage(1, "C", 25.0, 26.0);
		RankProgramingLanguage cPlus = new RankProgramingLanguage(1, "C++", 27.0, 32.0);
		RankProgramingLanguage cSharp = new RankProgramingLanguage(1, "C#", 12.0, 13.0);

		rankProgramingLanguages.add(java);
		rankProgramingLanguages.add(php);
		rankProgramingLanguages.add(ruby);
		rankProgramingLanguages.add(phyton);
		rankProgramingLanguages.add(c);
		rankProgramingLanguages.add(cPlus);
		rankProgramingLanguages.add(cSharp);

		Gson gson = new Gson();
		jsonData = gson.toJson(rankProgramingLanguages);
	}

	public String getJsonData() {
		return jsonData;
	}

	public void setJsonData(String jsonData) {
		this.jsonData = jsonData;
	}
	
}
