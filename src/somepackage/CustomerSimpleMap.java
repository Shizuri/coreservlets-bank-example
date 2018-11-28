package somepackage;

import java.util.HashMap;
import java.util.Map;

import somepackage.model.Customer;

public class CustomerSimpleMap implements CustomerLookupService {

	private Map<String, Customer> customers;

	public CustomerSimpleMap() {
		customers = new HashMap<>();
		//Customer tmpCustomer = new Customer("jas", "Zdravko", "Mavkov", 135.8, "blah");
		addCustomer(new Customer("jas", "Zdravko", "Mavkov", 135.8, "blah"));
	}

	@Override
	public Customer findCustomer(String customerId, String password) {
		if (customers.containsKey(customerId)) {
			if (this.customers.get(customerId).getPassword().equals(password)) {
				return (customers.get(customerId));
			}
		}
		return null;
	}

	private void addCustomer(Customer customer) {
		customers.put(customer.getId(), customer);
	}
}
