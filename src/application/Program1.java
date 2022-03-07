package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import entities_composition.Client;
import entities_composition.Order;
import entities_composition.OrderItem;
import entities_composition.Product;
import entities_composition_enums.OrderStatus;

public class Program1 {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		OrderStatus os = null;
//		
//		Product prod1 = new Product("TV", 1000.0);
//		Product prod2 = new Product("Mouse", 40.0);
//		OrderItem oi1 = new OrderItem(1, 1000.0, prod1);
//		OrderItem oi2 = new OrderItem(2, 40.0, prod2);
//		Client c1 = new Client("Lara Croft", "lara.croft@gmail.com", sdf.parse("11/06/1993"));
//		Order o = new Order(new Date(), os.PROCESSING, c1);
//		//Order o = new Order();
//		o.addItem(oi1);
//		o.addItem(oi2);
//		
//		System.out.println(prod1);
//		System.out.println(prod2);
//		System.out.println(oi1);
//		System.out.println(oi2);
//		System.out.println(o);
//		System.out.println(c1);
		
		Product prod = new Product();
		OrderItem oi1 = new OrderItem();
		OrderItem oi2 = new OrderItem();
		Order order = new Order();
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = "Alex Green";
		System.out.print("E-mail: ");
		String email = "alex@gmail.com";
		System.out.print("Birth date: (DD/MM/YYYY): ");
		Date dateBirth = sdf.parse("11/05/1998");
		Client client = new Client(name, email, dateBirth);
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = "PROCESSING";
		OrderStatus os = OrderStatus.valueOf(status);
		
		System.out.print("How many items to this order? ");
		int n = 2;
		for(int i=1; i<=n;i++) {
			System.out.println("Enter "+ i + " item data:");
			System.out.print("Product name: ");
			String prodName1 = "TV";
			System.out.print("Product price: ");
			double prodPrice1 = 1000.0;
			System.out.print("Quantity: ");
			int quant1 = 1;
			System.out.print("Product name: ");
			String prodName2 = "Mouse";
			System.out.print("Product price: ");
			double prodPrice2 = 40.0;
			System.out.print("Quantity: ");
			int quant2 = 2;
			Product prod1 = new Product(prodName1, prodPrice1);
			Product prod2 = new Product(prodName2, prodPrice2);
			oi1 = new OrderItem(quant1, prodPrice1, prod1);
			oi2 = new OrderItem(quant2, prodPrice2, prod2);
			
			order = new Order(new Date(), os, client);
			order.addItem(oi1);
			order.addItem(oi2);
		}
		
		System.out.println("\n--------------------------------------------------------------");
		System.out.println(order);
//		System.out.println(client);
//		System.out.println(oi1);
//		System.out.println(oi2);
//		System.out.println("Total price: R$ " + order.total());
		
		
		
		
		
		
	}
}
