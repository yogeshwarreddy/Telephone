package telephone.objects;

import java.io.InputStream;
import java.io.OutputStream;

public interface TelephoneSpeaker {
	void setSpeakerInputStream(InputStream input);
	InputStream getSpeakerInputStream();
	void setSpeakerOutputStream(OutputStream output);
	OutputStream getSpeakerOutputStream();
	
	/**
	 * Is responsible for streaming the input stream to the output console continuously in real time
	 */
	void realTimeHear();
}
