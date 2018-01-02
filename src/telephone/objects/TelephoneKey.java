package telephone.objects;

public class TelephoneKey {
	String value;
	boolean specialKey;

	public TelephoneKey(String value, boolean specialKey) {
		super();
		this.value = value;
		this.specialKey = specialKey;
	}

	public TelephoneKey(String value) {
		super();
		this.value = value;
		this.specialKey = false;
	}

	public static TelephoneKey[] generateDigits() {
		TelephoneKey[] digits = new TelephoneKey[10];
		for (int i = 0; i < 10; i++) {
			digits[i].setValue(i + "");
		}
		return digits;
	}

	public static TelephoneKey[] generateArrows() {
		TelephoneKey[] arrows = new TelephoneKey[4];
		String[] arrowValues = { "UP", "LEFT", "DOWN", "RIGHT" };
		for (int i = 0; i < 4; i++) {
			arrows[i].setValue(arrowValues[i]);
			arrows[i].setSpecialKey(true);
		}
		return arrows;
	}

	public static TelephoneKey[] generateFunctions() {
		TelephoneKey[] functions = new TelephoneKey[5];
		String[] functionValues = { "MENU", "SELECT", "BACK", "EXIT", "DIAL"};
		for (int i = 0; i < 5; i++) {
			functions[i].setValue(functionValues[i]);
			functions[i].setSpecialKey(true);
		}
		return functions;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the specialKey
	 */
	public boolean isSpecialKey() {
		return specialKey;
	}

	/**
	 * @param specialKey
	 *            the specialKey to set
	 */
	public void setSpecialKey(boolean specialKey) {
		this.specialKey = specialKey;
	}

}
