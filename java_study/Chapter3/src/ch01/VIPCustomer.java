package ch01;

public class VIPCustomer extends Customer{
	
	private int agentId;
	double salesRatio;
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		System.out.println("VIPCustomer(int, String) 생성자 호출");
	}
	public int getAgentId(int agentId) {
		return agentId;
	}
}
