package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities_composition.Product;
import entities_polimorfismo.ImportedProduct;
import entities_polimorfismo.UsedProduct;

public class Program2 {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Product prod = new Product();
		ImportedProduct imp = new ImportedProduct();
		UsedProduct usedProd = new UsedProduct();

		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("\nProduct " + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char r = sc.next().charAt(0);
			System.out.print("Name: ");
			String prodName = sc.next();
			System.out.print("Price: ");
			double prodPrice = sc.nextDouble();
			

			if (r == 'i') {
				System.out.print("Customs fee: ");
				double Customsfee = sc.nextDouble();
				imp = new ImportedProduct(prodName, prodPrice, Customsfee);
				list.add(prod);
				
			}

			if (r == 'c') {
				prod = new Product(prodName, prodPrice);
				list.add(prod);
			}

			if (r == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				usedProd = new UsedProduct(prodName, prodPrice, manufactureDate);
				list.add(prod);
			}
		}

		System.out.println();
		System.out.println("PRICE TAGS:");
		System.out.println(imp);
		System.out.println(prod);
		
		for(Product product : list) {
			System.out.println(product.getName());
		}
		
		
//		System.out.println(usedProd.getName() + " (used) R$ " +  usedProd.getPrice() + " (Manufacture date: " + usedProd + ")");
//		System.out.println(usedProd);
		sc.close();

	}
}
