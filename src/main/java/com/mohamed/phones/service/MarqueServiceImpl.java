package com.mohamed.phones.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohamed.phones.entities.Marque;
import com.mohamed.phones.repos.MarqueRepository;

@Service
public class MarqueServiceImpl implements MarqueService {

    @Autowired
    private MarqueRepository marqueRepository;

    @Override
    public Marque saveMarque(Marque marque) {
        return marqueRepository.save(marque);
    }
}