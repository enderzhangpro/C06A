// setting enum contains all code for temperature
public enum Temperature {
	COLD("cooool"), 
	WARM("warm"), 
	HOT("CAREFUL"), 
	BLAZING("VERY HOT! DON'T TOUCH");
	
	private String description;
		
	Temperature(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return description;
	}
}
