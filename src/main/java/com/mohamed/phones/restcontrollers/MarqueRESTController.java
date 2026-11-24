package com.mohamed.phones.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohamed.phones.entities.Marque;
import com.mohamed.phones.entities.Phone;
import com.mohamed.phones.repos.MarqueRepository;
import com.mohamed.phones.service.MarqueService;
import com.mohamed.phones.service.PhoneService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/marque")
@CrossOrigin("*")
@AllArgsConstructor

public class MarqueRESTController {
	
	//@Autowired
	private final MarqueRepository marqueRepository ;
	private final MarqueService marqueService ;
	
	
	//@RequestMapping(method=RequestMethod.GET)
	@GetMapping()
	public List<Marque> getAllMarque()
	{
	return marqueRepository.findAll();
	}
		
	@GetMapping("/{id}")
	public Marque getMarqueById(@PathVariable("id") Long id) {
		return marqueRepository.findById(id).get();
	 }
	@PostMapping()
	public Marque createMarque(@RequestBody Marque marque) {
	    return marqueService.saveMarque(marque);
	}
	@PutMapping()
	public Marque updateMarque(@RequestBody Marque marque) {
	    return marqueService.saveMarque(marque);
	}
	
}
