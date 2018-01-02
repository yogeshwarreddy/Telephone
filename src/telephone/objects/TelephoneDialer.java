package telephone.objects;

public class TelephoneDialer {
	TelephoneKey[] digits;
	TelephoneKey[] arrows;
	TelephoneKey[] functions;

	public TelephoneDialer(TelephoneKey[] digits, TelephoneKey[] arrows, TelephoneKey[] functions) {
		super();
		this.digits = digits;
		this.arrows = arrows;
		this.functions = functions;
	}

	public TelephoneDialer() {
		super();
		this.digits = TelephoneKey.generateDigits();
		this.arrows = TelephoneKey.generateArrows();
		this.functions = TelephoneKey.generateFunctions();
	}

	public TelephoneDialer(TelephoneKey[] functions) {
		super();
		this.digits = TelephoneKey.generateDigits();
		this.arrows = TelephoneKey.generateArrows();
		this.functions = functions;
	}

	/**
	 * @return the digits
	 */
	public TelephoneKey[] getDigits() {
		return digits;
	}

	/**
	 * @param digits
	 *            the digits to set
	 */
	public void setDigits(TelephoneKey[] digits) {
		this.digits = digits;
	}

	/**
	 * @return the arrows
	 */
	public TelephoneKey[] getArrows() {
		return arrows;
	}

	/**
	 * @param arrows
	 *            the arrows to set
	 */
	public void setArrows(TelephoneKey[] arrows) {
		this.arrows = arrows;
	}

	/**
	 * @return the functions
	 */
	public TelephoneKey[] getFunctions() {
		return functions;
	}

	/**
	 * @param functions
	 *            the functions to set
	 */
	public void setFunctions(TelephoneKey[] functions) {
		this.functions = functions;
	}

}
