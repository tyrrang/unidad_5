package mx.utng.practice.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="sports")
public class Sport {
	@Id @GeneratedValue
	private Long id;
	private String name;
	private String description;
	private String area;
	
	public Sport(String name, String description, String area) {
		super();
		this.name = name;
		this.description = description;
		this.area=area;
	}
	
	public Sport(){
		this("","","");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "Instrument [id=" + id + ", name=" + name + ", description=" + description + ", area=" + area +"]";
	}	
	
	
}
