package telephone.objects;

import java.io.InputStream;
import java.io.OutputStream;

public interface TelephoneMicrophone {
	void setMicInputStream(InputStream input);
	InputStream getMicInputStream();
	void setMicOutputStream(OutputStream output);
	OutputStream getMicOutputStream();
	/**
	 * Is responsible for streaming the input stream to the output console continuously in real time
	 */
	void realTimeSpeak();
}
