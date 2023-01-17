package com.naab.bloodbank.donor;


import com.naab.bloodbank.ResponseMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/donor")
@CrossOrigin(origins = "http://localhost:4200/")
public class DonorController {
    @Autowired
    private DonorService donorService;

    @GetMapping
    public List<Donor> getAll(){
        return donorService.findAll();
    }

    @PostMapping(value = {"", "/"})
    public ResponseMsg save(@RequestBody Donor donor){
        donorService.save(donor);
        return new ResponseMsg("success");
    }

    @DeleteMapping("/{id}")
    public ResponseMsg delete(@PathVariable String id){
        donorService.delete(id);
        return new ResponseMsg("success");
    }
}
