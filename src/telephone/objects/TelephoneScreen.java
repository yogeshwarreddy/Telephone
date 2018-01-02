package telephone.objects;

import java.io.OutputStream;

public class TelephoneScreen {
	OutputStream stream;
	
	public TelephoneScreen(OutputStream stream) {
		super();
		this.stream = stream;
	}

	public TelephoneScreen() {
		super();
		this.stream = System.out;
	}

	/**
	 * @return the stream
	 */
	public OutputStream getStream() {
		return stream;
	}

	/**
	 * @param stream the stream to set
	 */
	public void setStream(OutputStream stream) {
		this.stream = stream;
	}
	
}
