// setting enum contains all code for settings
public enum Setting {
	OFF("---"),
	LOW("--+"),
	MEDIUM("-++"),
	HIGH("+++");
	
	private String display;
	
	Setting(String display) {
		this.display = display;
	}
	
	@Override
	public String toString() {
		return display;
	}
}
