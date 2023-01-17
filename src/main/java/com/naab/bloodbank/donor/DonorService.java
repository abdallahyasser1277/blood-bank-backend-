package com.naab.bloodbank.donor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonorService {
    @Autowired
    private DonorRepo donorRepo;
    public List<Donor> findAll(){
        return donorRepo.findAll();
    }
    public Donor save(Donor donor){
        return donorRepo.insert(donor);
    }
    public void delete(String id){ donorRepo.deleteById(id);}

}
