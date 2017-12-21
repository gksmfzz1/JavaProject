package project.v1b;

public interface CustomerService {
	
	void addCustomer (CustomerVO cs);
	
	String getCustomer();
	
	String getCustomer(String cNum);
	
	void modifyCustomer(CustomerVO cs);		
	
	void removeCustomer(String cNum);
	
}
