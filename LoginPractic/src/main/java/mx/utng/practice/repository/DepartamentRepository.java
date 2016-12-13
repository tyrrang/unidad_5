package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.Departament;



@Repository
public interface DepartamentRepository extends JpaRepository<Departament, Long>{
	@Query("select depa from Departament depa")
	public List<Departament>findAll();
}
