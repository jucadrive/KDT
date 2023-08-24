package ch06;

public class VIPCustomer extends Customer{
	private int agentId;
	double salesRatio;
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	public int getAgentId(int agentId) {
		return agentId;
	}
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}
}
