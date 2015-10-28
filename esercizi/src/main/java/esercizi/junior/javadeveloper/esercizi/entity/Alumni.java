package esercizi.junior.javadeveloper.esercizi.entity;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;

public class Alumni {

	@Id
	private String id;
	
	private String name;

	private List<Addresse> addresses;
	private Map<String,Education> education;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Addresse> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Addresse> addresses) {
		this.addresses = addresses;
	}

	public Map<String, Education> getEducation() {
		return education;
	}

	public void setEducation(Map<String, Education> education) {
		this.education = education;
	}

}
