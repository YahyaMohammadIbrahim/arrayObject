package arrayObject;

public class Car {
	private String caption;
	private double price;
	private carModel carModel;
	private carColor carColor;
	public Car() {
		super();
		
	}
	public Car(String caption, double price) {
		super();
		this.caption = caption;
		this.price = price;
	}
	public Car(String caption, double price, arrayObject.carModel carModel) {
		super();
		this.caption = caption;
		this.price = price;
		this.carModel = carModel;
	}
	public Car(String caption, double price, arrayObject.carModel carModel, arrayObject.carColor carColor) {
		super();
		this.caption = caption;
		this.price = price;
		this.carModel = carModel;
		this.carColor = carColor;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public carModel getCarModel() {
		return carModel;
	}
	public void setCarModel(carModel carModel) {
		this.carModel = carModel;
	}
	public carColor getCarColor() {
		return carColor;
	}
	public void setCarColor(carColor carColor) {
		this.carColor = carColor;
	}
	
	
	

}
