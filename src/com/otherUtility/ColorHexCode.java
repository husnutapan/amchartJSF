package com.otherUtility;

import java.util.HashMap;

public class ColorHexCode {

	public static final HashMap<String, String> hexCodes = createHashMap();

	private static HashMap<String, String> createHashMap() {
		HashMap<String, String> colorHexCode = new HashMap<>();
		colorHexCode.put("AliceBlue", "#F0F8FF");
		colorHexCode.put("Black", "#000000");
		colorHexCode.put("Blue", "#0000FF");
		colorHexCode.put("Brown", "#A52A2A");
		colorHexCode.put("Cyan", "#00FFFF");
		colorHexCode.put("Gray", "#808080");
		colorHexCode.put("Green", "#008000");
		colorHexCode.put("Magenta", "#FF00FF");
		colorHexCode.put("Orange", "#FFA500");
		colorHexCode.put("Pink", "#FFC0CB");
		colorHexCode.put("Red", "#FF0000");
		colorHexCode.put("Silver", "#C0C0C0");
		colorHexCode.put("Turquoise", "#40E0D0");
		colorHexCode.put("Yellow", "#FFFF00");
		colorHexCode.put("White", "#FFFFFF");

		return colorHexCode;
	}

}
