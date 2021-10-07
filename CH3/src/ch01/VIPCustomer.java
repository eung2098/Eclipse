package ch01;

public class VIPCustomer extends Customer{
	
	private String agentId;
	double salesRatio;
	
	public VIPCustomer()
	{
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	public String getAgentId() {
		return agentId;
	}
	

}
