package Problem1.service;

public class PaintingService extends Service {

	private String startDate;
	private String expectedEndDate;
	private String painingColor;
	private int size;
	private String address;
	private int price;

	public PaintingService(String description, String startDate, String expectedEndDate, String painingColor, int size,
			String address) {
		super(description);
		this.description = description;
		this.startDate = startDate;
		this.expectedEndDate = expectedEndDate;
		this.painingColor = painingColor;
		this.size = size;
		this.address = address;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getExpectedEndDate() {
		return expectedEndDate;
	}

	public void setExpectedEndDate(String expectedEndDate) {
		this.expectedEndDate = expectedEndDate;
	}

	public String getPainingColor() {
		return painingColor;
	}

	public void setPainingColor(String painingColor) {
		this.painingColor = painingColor;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
