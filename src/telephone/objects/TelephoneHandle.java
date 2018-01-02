package telephone.objects;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

public class TelephoneHandle implements TelephoneMicrophone, TelephoneSpeaker {
	AtomicBoolean lifted;
	InputStream speakerInput;
	OutputStream speakerOutput;
	InputStream micInput;
	OutputStream micOutput;

	
	/**
	 *  recommended constructor to use
	 *   set the streams on lifting the handle and close the streams on placing back the handle
	 */
	public TelephoneHandle() {
		super();
		this.lifted = new AtomicBoolean(false);
		this.speakerInput = System.in;
		this.speakerOutput = System.out;
	}
	
	public TelephoneHandle(InputStream speakerInput) {
		super();
		this.lifted = new AtomicBoolean(false);
		this.speakerInput = speakerInput;
		this.speakerOutput = System.out;
	}

	public TelephoneHandle(InputStream speakerInput, OutputStream speakerOutput) {
		super();
		this.lifted = new AtomicBoolean(false);
		this.speakerInput = speakerInput;
		this.speakerOutput = speakerOutput;
	}

	public TelephoneHandle(AtomicBoolean lifted, InputStream speakerInput, OutputStream speakerOutput) {
		super();
		this.lifted = lifted;
		this.speakerInput = speakerInput;
		this.speakerOutput = speakerOutput;
	}

	@Override
	public void setSpeakerInputStream(InputStream speakerInput) {
		this.speakerInput = speakerInput;
	}

	@Override
	public InputStream getSpeakerInputStream() {
		return speakerInput;
	}

	@Override
	public void setSpeakerOutputStream(OutputStream speakerOutput) {
		this.speakerOutput = speakerOutput;

	}

	@Override
	public OutputStream getSpeakerOutputStream() {
		return speakerOutput;
	}

	@Override
	public void realTimeHear() {
		while (lifted.get()) {
			synchronized (speakerOutput) {
				int character;
				try {
					if ((character = speakerInput.read()) != -1) {
						speakerOutput.write("\nThe Other Person: ".getBytes());
						do {
							speakerOutput.write((char) character);
						} while ((character = speakerInput.read()) != -1);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public boolean isLifted() {
		return lifted.get();
	}

	public void lift() {
		this.lifted.set(true);
		//TODO create/open the streams when lifted and assign them accordingly
		
		// TODO create new thread here and assign realTimeHear() method to it
	}

	public void place() {
		this.lifted.set(false);
		//TODO close all the streams
	}

	@Override
	public void setMicInputStream(InputStream micInput) {
		this.micInput = micInput;
	}

	@Override
	public InputStream getMicInputStream() {
		return this.micInput;
	}

	@Override
	public void setMicOutputStream(OutputStream micOutput) {
		this.micOutput = micOutput;
	}

	@Override
	public OutputStream getMicOutputStream() {
		return this.micOutput;
	}

	@Override
	public void realTimeSpeak() {
		while (lifted.get()) {
			synchronized (micOutput) {
				int character;
				try {
					while ((character = micInput.read()) != -1) {
						micOutput.write((char) character);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
