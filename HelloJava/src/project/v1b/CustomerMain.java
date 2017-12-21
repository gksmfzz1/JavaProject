package project.v1b;

public class CustomerMain {

	public static void main(String[] args) {
		CustomerService cssrv = new CustomerServiceImnl();
		
		CustomerVO cs = new CustomerVO("1","박지성","810101-1xxxxxx","영국런던","000-5000-0001");
		
		cssrv.addCustomer(cs);
		
		System.out.println(cs);

		cs = new CustomerVO("2","박지성","860701-1xxxxxx","대한민국 서울","000-6811-1548");
		cssrv.modifyCustomer(cs);	
		
		cssrv.removeCustomer("2");
		
		
	}

}
