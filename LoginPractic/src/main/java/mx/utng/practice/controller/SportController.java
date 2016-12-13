package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import mx.utng.practice.model.Sport;
import mx.utng.practice.repository.SportRepository;;

@Named
@ViewScoped
public class SportController {
	@Autowired
	private SportRepository sportRepository;
	private Sport sport = new Sport();
	private List<Sport> sports;
	
	private boolean editMode = false;
	@PostConstruct
	public void init(){
		setSports(sportRepository.findAll());
	}
	
	public void save(){
		sportRepository.save(sport);
		if(!editMode){
			getSports().add(sport);
		}
		sport=new Sport();
		setEditMode(false);
	}
	
	public void delete(Sport sport){
		sportRepository.delete(sport);
		sports.remove(sport);
	}
	
	public void update(Sport sport){
		setSport(sport);
		setEditMode(true);
	}
	
	public void cancel(){
		sport = new Sport();
		setEditMode(false);
	}
	
	public SportRepository getSportRepository() {
		return sportRepository;
	}

	public void setSportRepository(SportRepository sportRepository) {
		this.sportRepository = sportRepository;
	}

	public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}

	public List<Sport> getSports() {
		return sports;
	}

	public void setSports(List<Sport> sports) {
		this.sports = sports;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}	
	
}
