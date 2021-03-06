package entities_composition;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities_composition_enums.OrderStatus;

public class Order {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
	}
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	public Date getMoment() {
		return moment;
	}
	
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	public OrderStatus getStatus() {
		return status;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		for(OrderItem it : items) {
			sum += it.subTotal();
		}
		
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();{
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order Status: " + status);
		sb.append("\nClient: " + client);
		sb.append("\n" + items);
//		for(OrderItem oi : items) {
//			System.out.println("it: " + oi);
//			
//		}
		sb.append("\nTotal price: R$ " + String.format("%.2f", total()));
		}
		return sb.toString();
		//return "ORDER Moment: " +  sdf.format(moment) + "\n" + "ORDER STATUS: " + status;
	}

	

}
