package com.naab.bloodbank.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRepo adminRepo;
    public List<Admin> findAll(){
        return adminRepo.findAll();
    }
}
