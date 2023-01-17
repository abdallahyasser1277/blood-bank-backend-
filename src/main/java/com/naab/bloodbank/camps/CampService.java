package com.naab.bloodbank.camps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampService {
    @Autowired
    private CampRepo campRepo;
    public List<Camp> findAll(){
        return campRepo.findAll();
    }
    public Camp save(Camp camp){
        return campRepo.insert(camp);
    }
    public void delete(String id){ campRepo.deleteById(id);}
}
