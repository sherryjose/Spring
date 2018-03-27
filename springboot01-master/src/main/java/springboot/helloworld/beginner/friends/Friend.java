package springboot.helloworld.beginner.friends;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Friend {
	
	@Id
	private String id;
	private String name;
	private String location;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Friend(String id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	
	public Friend() {
		
	}
	

}
