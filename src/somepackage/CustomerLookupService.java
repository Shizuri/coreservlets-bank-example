package somepackage;

import somepackage.model.Customer;

public interface CustomerLookupService {
	public Customer findCustomer(String customerId, String password);
}
