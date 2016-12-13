package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mx.utng.practice.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
	@Query("select cont from Contact cont")
	public List<Contact>findAll();
}
