package entities_polimorfismo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

	private Date manufactureDate;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, Double price, Date manufactDate) {
		super(name, price);
		this.manufactureDate = manufactDate;
	}
	
	public Date getManufactureDate() {
		return manufactureDate;
	}
	
	public void setManufacture(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return super.getName() + super.getPrice();
	}
	
	@Override
	public String toString() {
	return sdf.format(getManufactureDate());
	}
	
	
}
