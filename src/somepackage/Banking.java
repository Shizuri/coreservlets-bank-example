package somepackage;

import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.*;

import somepackage.model.Customer;

@ManagedBean
public class Banking {
	private String customerId;
	private String password;

	private Map<String, Customer> customers = new HashMap<>();
	
	private Customer user = new Customer();
	
	public Banking() {
		Customer tmpCustomer = new Customer("jas","Zdravko", "Mavkov",135.8 , "blah");
		customers.put(tmpCustomer.getId(), tmpCustomer);
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer getUser() {
		return user;
	}

	public String login() {
		if(this.customers.containsKey(this.customerId)) {
			if(this.customers.get(customerId).getPassword().equals(this.password)) {
				this.user = this.customers.get(customerId);
				return("welcome");
			}
		}
		
		return ("error");
	}
	
	public String toStartPage() {
		return ("index");
	}
}
