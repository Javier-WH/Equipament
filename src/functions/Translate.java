package functions;

import java.util.HashMap;

public class Translate {
	public static String translateFrequency(String number) {

		HashMap<String, String> frequencys = new HashMap<>();
		frequencys.put("1", "Diario");
		frequencys.put("7", "Semanal");
		frequencys.put("14", "Quincenal");
		frequencys.put("30", "Mensual");
		frequencys.put("182", "Semestral");
		frequencys.put("365", "Anual");

		if (frequencys.containsKey(number)) {
			return frequencys.get(number);
		} else {
			return number;
		}
	}
}
