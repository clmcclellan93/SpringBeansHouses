package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class House {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String owner;
	private String type; //residential, business, school, etc.
	private int floors;
	
	@Autowired
	private Address address;
	
	public House() {
		super();
	}

	/**
	 * @param owner
	 * @param numFloors
	 * @param type
	 */
	public House(String owner, String type, int floors) {
		this.floors = floors;
		this.owner = owner;
		this.type = type;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the numFloors
	 */
	public int getFloors() {
		return floors;
	}

	/**
	 * @param numFloors the numFloors to set
	 */
	public void setFloors(int floors) {
		this.floors = floors;
	}
	
	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "House [id=" + id + ", numFloors=" + floors + ", type=" + type + ", address=" + address + "]";
	}
	
	
}
