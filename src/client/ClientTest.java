package client;

import dao.AddressDAO;
import dao.CustomerDAO;

import java.util.Iterator;

import annotation.Address;
import annotation.Customer;
import util.HibernateUtil;

public class ClientTest {

	public static void main(String[] args) {
		// Customer cust1 = new Customer("JACK", "Marlet", 15);
		// Customer cust2 = new Customer("YAN", "BILLANA", 20);
		// cust1.setAddress(new Address("40-50", "Pahonyothin", "BKK", "11111"));
		// cust2.setAddress(new Address("55-89", "Bankna", "BKK", "12345"));

		// Customer cust1 = new Customer("JACK","Marlet",15);
		// cust1.getAddresses().add(new Address("40-50", "Pahonyothin", "BKK",
		// "11111"));
		// cust1.getAddresses().add(new Address("55-89", "Bangna", "BKK", "12345"));

		// AddressDAO addrdao = new AddressDAO();

		// Address addr1 = new Address("55-89","Bangna","BKK","12345");
		// Customer cust1 = new Customer("JACK","Marlet",15);
		// cust1.getAddresses().add(new Address("40-50","Pahonyothin","BKK","11111"));
		// cust1.getAddresses().add(addr1);
		//
		// Customer cust2 = new Customer("LATE","SARAMANA",33);
		// cust2.getAddresses().add(new Address("10-22","Rama6","BKK","22222"));
		// cust2.getAddresses().add(addr1);

		try {

			HibernateUtil.beginTransaction();
			CustomerDAO custdao = new CustomerDAO();
			Customer cust3 = custdao.findByPK(1);
			System.out.println("cust's Addr: " + cust3.getFirstname());
			Iterator<Address> addrs = cust3.getAddresses().iterator();

			while (addrs.hasNext()) {
				Address addr = (Address) addrs.next();
				System.out.println("Address: " + addr.getRoad());
			}

			// AddressDAO addrdao = new AddressDAO();
			// Address addr = addrdao.findByPK(3);
			// System.out.println("Addr: "+addr.getRoad());
			// Iterator<Customer> custs = addr.getCustomer().iterator();
			//
			// while(custs.hasNext()) {
			// Customer cust = (Customer) custs.next();
			// System.out.println("First Name: "+cust.getFirstname());
			// }
			//
			// addrdao.delete(addr);
			// HibernateUtil.commitTransaction();

			// CustomerDAO custdao = new CustomerDAO();
			// custdao.insert(cust1);
			// custdao.insert(cust2);
			// HibernateUtil.commitTransaction();
			// System.out.println("DONE");

			// AddressDAO addrdao = new AddressDAO();
			// Address addr = addrdao.findByPK(1);
			// System.out.println("First Name: "+addr.getCustomer().getFirstname());
			// CustomerDAO custdao = new CustomerDAO();
			// Customer cust = custdao.findByPK(1);
			// Iterator<Address> addresses = cust.getAddresses().iterator();
			//
			// while(addresses.hasNext()) {
			//
			// Address addrtemp = (Address)addresses.next();
			// System.out.println("Address Road: "+addrtemp.getRoad());
			//
			// }

			// CustomerDAO custdao = new CustomerDAO();
			// custdao.insert(cust1);

			// CustomerDAO custdao = new CustomerDAO();
			// Customer cust3 = custdao.findByPK(1);
			// custdao.delete(cust3);

			// custdao.insert(cust1);
			// custdao.insert(cust2);

			// Address addr = addrdao.findByPK(2);
			// System.out.println(addr.getCustomer().getFirstname());

			// HibernateUtil.commitTransaction();
			// HibernateUtil.closeSession();
			// System.out.println("DONE");

		} catch (Exception ex) {
			System.out.println("ERROR");
			HibernateUtil.rollbackTransaction();
		}
	}

}
