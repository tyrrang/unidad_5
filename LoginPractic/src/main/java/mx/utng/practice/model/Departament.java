package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="departments")
public class Departament {
	@Id @GeneratedValue
	@Column(name="departament_id")
	private Long departmentId;
	@Column(name="department_name")
	private String departmentName;
	@Column(name="manager_id")
	private int managerId;
	@Column(name="location_id")
	private int locationId;
	
	public Departament(String department_name, int manager_id, int location_id){
		super();
		this.departmentName=department_name;
		this.managerId=manager_id;
		this.locationId=location_id;
	}
	
	public Departament(){
		this("",0,0);
	}

	public Long getDepartment_id() {
		return departmentId;
	}

	public void setDepartment_id(Long department_id) {
		this.departmentId = department_id;
	}

	public String getDepartment_name() {
		return departmentName;
	}

	public void setDepartment_name(String department_name) {
		this.departmentName = department_name;
	}

	public int getManager_id() {
		return managerId;
	}

	public void setManager_id(int manager_id) {
		this.managerId = manager_id;
	}

	public int getLocation_id() {
		return locationId;
	}

	public void setLocation_id(int location_id) {
		this.locationId = location_id;
	}
	
	@Override
	public String toString() {
		return "Departament [department_id=" + departmentId + ", department_name=" + departmentName + ", manager_id=" + managerId + ", location_id=" + locationId +"]";
	}	
}
