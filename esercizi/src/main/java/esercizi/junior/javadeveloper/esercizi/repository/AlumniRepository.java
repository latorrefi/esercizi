package esercizi.junior.javadeveloper.esercizi.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import esercizi.junior.javadeveloper.esercizi.entity.Alumni;

public interface AlumniRepository extends MongoRepository<Alumni,String> {

	public List<Alumni> findByName(String firstName);
}
