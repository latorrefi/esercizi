package esercizi.junior.javadeveloper.esercizi.bls;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import esercizi.junior.javadeveloper.esercizi.entity.Alumni;
import esercizi.junior.javadeveloper.esercizi.repository.AlumniRepository;
import esercizi.junior.javadeveloper.esercizi.response.GetAlumniForName;
import esercizi.junior.javadeveloper.esercizi.utility.Constants;
import esercizi.junior.javadeveloper.esercizi.utility.GenericInternalError;
import esercizi.junior.javadeveloper.esercizi.utility.InvalidRequestException;

@Service
/**
 * Class to simplify access to persistance layer for alumni collection
 * @author Filippo
 *
 */
public class BLSAlumni {

	private static final Logger logger = LoggerFactory.getLogger(BLSAlumni.class);
	
	@Autowired
	private AlumniRepository repository;
	
	/**
	 * Perform input validation and retrieve size of alumni documents searched by name and
	 * a list of this documents
	 * @param name Param to search in alumni collection
	 * @return
	 */
	public GetAlumniForName getAlumniForName(String name){
		String methodName = "getAlumniForName";
		logger.debug("Init "+methodName);
		if(Constants.INVALID_STRING_INPUT.equals(name)){
			String msg = "Invalid name input";
			logger.warn(msg);
			throw new InvalidRequestException(msg);
		}
		GetAlumniForName result = new GetAlumniForName();
		List<Alumni> alumniList = repository.findByName(name);
		if (alumniList.size() == 0) {
			logger.warn("No data found for name: " + name);
			throw new EmptyResultDataAccessException("One or more rows expected for getAlumniForName", 1);
		}
		result.setTotalCount(alumniList.size());
		result.setData(alumniList);
		logger.debug("Exit " + methodName);
		return result;
	}
	
	/**
	 * Perform input validation and insert a new document in alumni collection
	 * @param alumno the document to be inserted
	 * @return
	 */
	public void insertAlumno(Alumni alumno){
		String methodName = "insertAlumno";
		logger.debug("Init "+methodName);
		try{
		repository.save(alumno);
		}
		catch(Exception e){
			String msg = "Error on "+methodName;
			logger.error(msg,e);
			throw new GenericInternalError(msg);
		}
		logger.debug("Exit " + methodName);
	}
	
}
