package com.naab.bloodbank.recipient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipientService {
    @Autowired
    private RecipientRepo recipientRepo;

    public List<Recipient> findAll(){
        return recipientRepo.findAll();
    }
    public Recipient save(Recipient recipient){
        return recipientRepo.insert(recipient);
    }
    public void delete(String id){
        recipientRepo.deleteById(id);
    }

}
