package com.naab.bloodbank.contacter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContacterService {
    @Autowired
    private ContacterRepo contacterRepo;
    public List<Contacter> findAll(){
        return contacterRepo.findAll();
    }
    public Contacter save(Contacter contacter){
        return contacterRepo.insert(contacter);
    }
    public void delete(String id){
        contacterRepo.deleteById(id);
    }

}
