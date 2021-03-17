package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private int weight;
	private double price;
	private String color;
	@Autowired
	private Manufacturer manufacturer;
	
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
		this.color = "Black";
	}
	
	public Phone(String name) {
		super();
		this.name = name;
	}

	public Phone(String name, int weight, double price, String color) {
		super();
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.color = color;
	}
	public Phone(long id, String name, int weight, double price, String color) {
		super();
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.color = color;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", name=" + name + ", weight=" + weight + ", price=" + price + ", color=" + color
				+ ", manufacturer=" + manufacturer + "]";
	}
	
	
}