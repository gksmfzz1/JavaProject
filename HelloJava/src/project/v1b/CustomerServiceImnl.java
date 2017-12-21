package project.v1b;

public class CustomerServiceImnl implements CustomerService {

	@Override
	public void addCustomer(CustomerVO cs) {
		System.out.println("새로운 고객정보가 추가되었습니다");
	}

	@Override
	public String getCustomer() {
		String out = "고객정보를 출력합니다";
		return out;
	}

	@Override
	public String getCustomer(String cNum) {
		return cNum;
	}

	@Override
	public void modifyCustomer(CustomerVO cs) {
		System.out.println("고객정보가 수정되었습니다"); 
	}

	@Override
	public void removeCustomer(String cNum) {
		System.out.println("고객정보가 삭제되었습니다");
	}

}
