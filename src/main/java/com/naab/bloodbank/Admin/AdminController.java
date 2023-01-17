package com.naab.bloodbank.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/admin")
@CrossOrigin(origins = "http://localhost:4200/")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping(value = {"login", "login/"})
    public LoginResponse login(@RequestBody Admin logedAdmin){

        for (Admin admin:adminService.findAll()){

            if(admin.getEmail().equals(logedAdmin.getEmail())
                    && admin.getPassword().equals(logedAdmin.getPassword())){
                LoginResponse response= new LoginResponse("success","no errors",
                        new Token(admin.getName(),
                                admin.getEmail(),
                                admin.getPassword()));
                return response;
            }
        }
        return new LoginResponse("error","email or password not found  ",null);
    }

}
