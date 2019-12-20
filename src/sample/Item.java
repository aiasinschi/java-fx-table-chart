package sample;

public class Item {
	private String name;

	private double value;

	private int items;

	private double total;

	public Item(String name, double value, int items) {
		this.name = name;
		this.value = value;
		this.items = items;
		this.total = value * items;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public int getItems() {
		return items;
	}

	public void setItems(int items) {
		this.items = items;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
}
