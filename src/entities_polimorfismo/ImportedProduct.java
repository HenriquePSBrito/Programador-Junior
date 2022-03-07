package entities_polimorfismo;

public class ImportedProduct extends Product{

	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.setCustomsFee(customsFee);
	}
	
	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return getPrice() + customsFee;
	}

	@Override
	public String priceTag() {
		return super.getName() + customsFee;
	}
	
//	@Override
//	public String toString() {
//		return super.getName() + " Customs fee: R$ " + String.format("%.2f", getCustomsFee());
//	}
}
