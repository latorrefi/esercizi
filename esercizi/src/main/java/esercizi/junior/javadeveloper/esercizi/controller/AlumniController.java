package esercizi.junior.javadeveloper.esercizi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import esercizi.junior.javadeveloper.esercizi.bls.BLSAlumni;
import esercizi.junior.javadeveloper.esercizi.entity.Alumni;
import esercizi.junior.javadeveloper.esercizi.response.GetAlumniForName;
import esercizi.junior.javadeveloper.esercizi.utility.Constants;

@RestController
public class AlumniController {

	@Autowired
	BLSAlumni blsAlumni;
	
	@RequestMapping(value="/ex1/alumni", method=RequestMethod.POST)
	public void insert(@RequestBody Alumni alumno) {
		blsAlumni.insertAlumno(alumno);
    }
	
	@RequestMapping(value="/ex1/alumni", method=RequestMethod.GET)
	public GetAlumniForName getAlumniForName(@RequestParam(value="name", defaultValue=Constants.INVALID_STRING_INPUT) String name) {
		return blsAlumni.getAlumniForName(name);
    }
	
	
}
