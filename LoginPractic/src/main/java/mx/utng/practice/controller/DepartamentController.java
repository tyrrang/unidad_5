package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.Departament;
import mx.utng.practice.model.Sport;
import mx.utng.practice.repository.DepartamentRepository;
import mx.utng.practice.repository.SportRepository;;

@Named
@ViewScoped
public class DepartamentController {
	@Autowired
	private DepartamentRepository departamentRepository;
	private Departament departament = new Departament();
	private List<Departament> departaments;
	
	private boolean editMode = false;
	@PostConstruct
	public void init(){
		setDepartaments(departamentRepository.findAll());
	}
	
	public void save(){
		departamentRepository.save(departament);
		if(!editMode){
			getDepartaments().add(departament);
		}
		departament=new Departament();
		setEditMode(false);
	}
	
	public void delete(Departament departament){
		departamentRepository.delete(departament);
		departaments.remove(departament);
	}
	
	public void update(Departament departament){
		setDepartament(departament);
		setEditMode(true);
	}
	
	public void cancel(){
		departament = new Departament();
		setEditMode(false);
	}
	
	public DepartamentRepository getSportRepository() {
		return departamentRepository;
	}

	public void setSportRepository(DepartamentRepository departamentRepository) {
		this.departamentRepository = departamentRepository;
	}
	

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public List<Departament> getDepartaments() {
		return departaments;
	}

	public void setDepartaments(List<Departament> departaments) {
		this.departaments = departaments;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
}
