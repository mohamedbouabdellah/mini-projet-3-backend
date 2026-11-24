package com.mohamed.phones;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mohamed.phones.entities.Marque;
import com.mohamed.phones.entities.Phone;
import com.mohamed.phones.repos.PhoneRepository;

@SpringBootTest
class PhonesApplicationTests {

	@Autowired
	private PhoneRepository phoneRepository;
	
	
	@Test
	public void testCreatePhone() {
		Phone phone = new Phone("L'Asus ROG Phone 9 Pro",2500.0,new Date());
		phoneRepository.save(phone);
	}
	
	
	@Test
	public void testFindPhone(){
		Phone p = phoneRepository.findById(1L).get();
		System.out.println(p);
	}
	
	
	@Test
	public void testUpdatePhone()
	{
	Phone p = phoneRepository.findById(1L).get();
	p.setPrixPhone(2000.0);
	phoneRepository.save(p);
	}
	
	
	@Test
	public void testDeletePhone(){
		phoneRepository.deleteById(1L);;
	}
 
	@Test
	public void testListerTousProduits(){
		List<Phone> prods = phoneRepository.findAll();
		for (Phone p : prods){
			System.out.println(p);
			}
	}
	
	
	@Test
	public void testFindByNomPhone(){
		List<Phone> phones = phoneRepository.findByNomPhone("iPhone 14");
		for (Phone p : phones){
			System.out.println(p);
		}
	}
	
	@Test
	public void testFindByNomPhoneContains(){
		List<Phone> phones = phoneRepository.findByNomPhoneContains("O");
		for (Phone p : phones){
			System.out.println(p);
		}
	}
	
	
	@Test
	public void testfindByNomPrix(){
		List<Phone> phones = phoneRepository.findByNomPrix("Galaxy S22", 1500.0);
		for (Phone p : phones){
			System.out.println(p);
		}
	}
	
	@Test
	public void testfindByCategorie(){
		Marque marque = new Marque();
		marque.setIdMarque(1L);
		List<Phone> phones = phoneRepository.findByMarque(marque);
		for (Phone p : phones){
				System.out.println(p);
		}
	}
	
	@Test
	public void findByMarqueIdMarque(){
		List<Phone> phones = phoneRepository.findByMarqueIdMarque(2L);
		for (Phone p : phones)
		{
			System.out.println(p);
		}
	 }
	
	
	@Test
	public void testfindByOrderByNomPhoneAsc(){
		List<Phone> phones =phoneRepository.findByOrderByNomPhoneAsc();
		for (Phone p : phones)
		{
			System.out.println(p);
		}
	}

	@Test
	public void testTrierPhonesNomsPrix(){
		List<Phone> phones = phoneRepository.trierPhonesNomsPrix();
		for (Phone p : phones){
			System.out.println(p);
		}
	}
	
	
	
	
}
