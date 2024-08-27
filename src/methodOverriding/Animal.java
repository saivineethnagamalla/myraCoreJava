package methodOverinding;

public class AnimalMethod {

	public String category;
	public String livesOn;

	public AnimalMethod(String category, String livesOn) {
		super();
		this.category = category;
		this.livesOn = livesOn;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLivesOn() {
		return livesOn;
	}

	public void setLivesOn(String livesOn) {
		this.livesOn = livesOn;
	}

	public String con() {
		return category + livesOn;
	}

}
