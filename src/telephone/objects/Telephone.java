package telephone.objects;

public class Telephone {
	private TelephoneDialer dialer;
	private TelephoneScreen screen;
	private TelephoneHandle handle;
	public Telephone() {
		super();
		this.dialer = new TelephoneDialer();
		this.screen = new TelephoneScreen();
		this.handle = new TelephoneHandle();
	}
	
	void dial() {
		
	}

	/**
	 * configures and starts up the telephone 
	 * 1. must be able to call others
	 * 2. must be able to receive incoming calls
	 */
	public void start() {
		// TODO Auto-generated method stub
		
	}
}
