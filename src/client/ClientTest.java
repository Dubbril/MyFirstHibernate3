package client;

import dao.AddressDAO;
import dao.CustomerDAO;
import annotation.Address;
import annotation.Customer;
import util.HibernateUtil;

public class ClientTest {

	public static void main(String[] args) {
		// Customer cust1 = new Customer("JACK", "Marlet", 15);
		// Customer cust2 = new Customer("YAN", "BILLANA", 20);
		// cust1.setAddress(new Address("40-50", "Pahonyothin", "BKK", "11111"));
		// cust2.setAddress(new Address("55-89", "Bankna", "BKK", "12345"));
		
		Customer cust1 = new Customer("JACK","Marlet",15);
		cust1.getAddresses().add(new Address("40-50", "Pahonyothin", "BKK", "11111"));
		cust1.getAddresses().add(new Address("55-89", "Bangna", "BKK", "12345"));

//		AddressDAO addrdao = new AddressDAO();

		try {
			HibernateUtil.beginTransaction();
			
			CustomerDAO custdao = new CustomerDAO();
			custdao.insert(cust1);

			
			// CustomerDAO custdao = new CustomerDAO();
			// Customer cust3 = custdao.findByPK(1);
			// custdao.delete(cust3);

			// custdao.insert(cust1);
			// custdao.insert(cust2);

			// Address addr = addrdao.findByPK(2);
			// System.out.println(addr.getCustomer().getFirstname());

			HibernateUtil.commitTransaction();
			HibernateUtil.closeSession();
			System.out.println("DONE");

		} catch (Exception ex) {
			System.out.println("ERROR");
			HibernateUtil.rollbackTransaction();
		}
	}

}
