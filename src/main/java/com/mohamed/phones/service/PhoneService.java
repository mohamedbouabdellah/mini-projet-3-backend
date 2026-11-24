package com.mohamed.phones.service;

import java.util.List;

import com.mohamed.phones.entities.Marque;
import com.mohamed.phones.entities.Phone;

public interface PhoneService {
	Phone savePhone(Phone p);
	Phone updatePhone(Phone p);
	void deletePhone(Phone p);
	 void deletePhoneById(Long id);
	Phone getPhone(Long id);
	List<Phone> getAllPhones();
	List<Phone> findByNomPhone(String nom);
	List<Phone> findByNomPhoneContains(String nom);
	List<Phone> findByNomPrix (String nom, Double prix);
	List<Phone> findByMarque (Marque marque);
	List<Phone> findByMarqueIdMarque(Long id);
	List<Phone> findByOrderByNomPhoneAsc();
	List<Phone> trierPhonesNomsPrix();
}
 