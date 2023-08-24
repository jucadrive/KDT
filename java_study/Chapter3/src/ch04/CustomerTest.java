package ch04;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(price);
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer vipCustomerJoo = new VIPCustomer(10020, "주현준");
		vipCustomerJoo.bonusPoint = 20000;
		price = vipCustomerJoo.calcPrice(1000);
		System.out.println(price);
		System.out.println(vipCustomerJoo.showCustomerInfo());
		
		Customer vc = new VIPCustomer(12345, "noname");
		
		System.out.println(vc.calcPrice(1000));
	}

}
