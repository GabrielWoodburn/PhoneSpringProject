package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Manufacturer {
	private String manufacturerName;
	private String location;
	private String comment;
	public Manufacturer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Manufacturer(String manufacturerName, String location, String comment) {
		super();
		this.manufacturerName = manufacturerName;
		this.location = location;
		this.comment = comment;
	}
	
	public String getManufacturerName() {
		return manufacturerName;
	}
	
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Override
	public String toString() {
		return "Manufacturer [manufacturerName=" + manufacturerName + ", location=" + location + ", comment=" + comment
				+ "]";
	}
	

}