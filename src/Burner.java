public class Burner {
	private Temperature myTemperature;
	private Setting mySetting;
	private int timer;
	public static final int TIME_DURATION = 2;

	public Burner() {
		super();
		myTemperature = Temperature.COLD;
		mySetting = Setting.OFF;
		timer = 0;
	}
	
	public Temperature getMyTemperature() {
		return myTemperature;
	}
	
	// increase the temperature setting
	public void plusButton() {
		switch (mySetting) {
			case OFF:
				mySetting = Setting.LOW;
				break;
			case LOW:
				mySetting = Setting.MEDIUM;
				break;
			case MEDIUM:
				mySetting = Setting.HIGH;
				break;
			case HIGH:
				break;
		}
		timer = TIME_DURATION; // reset the timer whenever the time is changed
	}
	
	// decrease the temperature setting
	public void minusButton() {
		switch (mySetting) {
			case HIGH:
				mySetting = Setting.MEDIUM;
				break;
			case MEDIUM:
				mySetting = Setting.LOW;
				break;
			case LOW:
				mySetting = Setting.OFF;
				break;
			case OFF:
				break;
		}
		timer = TIME_DURATION; // reset the timer whenever the time is changed
	}
	
	// update the temperature and change the temperature if the timer hits zero
	public void updateTemperature() {
		if (timer > 0) {
			timer--;
			if (timer == 0) {
				switch (mySetting) {
					case OFF:
						myTemperature = Temperature.COLD;
						break;
					case LOW:
						myTemperature = Temperature.WARM;
						break;
					case MEDIUM:
						myTemperature = Temperature.HOT;
						break;
					case HIGH:
						myTemperature = Temperature.BLAZING;
						break;
				}
			}
		}
	}
	
	public void display() {
		System.out.println("[" + mySetting + "]....." + myTemperature);
	}	
}
