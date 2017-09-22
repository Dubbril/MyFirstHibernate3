package annotation;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name = "chvHomNo")
	private String homeno;

	@Column(name = "road")
	private String road;

	@Column(name = "chvProvince")
	private String province;

	@Column(name = "chvZipCode")
	private String zipcode;

//	@OneToOne(mappedBy = "address")
//	private Customer customer;
	
//	@ManyToOne
//	@JoinColumn(name="adcustid",insertable=false,updatable=false)
//	private Customer customer;
	
	
	
//
//	public Customer getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}
	
	@ManyToMany(cascade= {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(name="Cust_Addr",joinColumns=@JoinColumn(name="addr_id"),inverseJoinColumns=@JoinColumn(name="cust_id"))
	private Set<Customer>customer;
	
	

	public Set<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}

	public Address() {

	}

//	public Address(String homeno, String road, String province, String zipcode) {
//		this.homeno = homeno;
//		this.road = road;
//		this.province = province;
//		this.zipcode = zipcode;
//	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHomeno() {
		return homeno;
	}

	public void setHomeno(String homeno) {
		this.homeno = homeno;
	}

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

//	public Customer getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}

}
