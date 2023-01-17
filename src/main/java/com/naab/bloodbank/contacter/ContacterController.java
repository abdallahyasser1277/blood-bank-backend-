package com.naab.bloodbank.contacter;

import com.naab.bloodbank.ResponseMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/contacter")
@CrossOrigin(origins = "http://localhost:4200/")
public class ContacterController {
    @Autowired
    private ContacterService contacterService;

    @GetMapping(value = {"", "/"})
    public List<Contacter> getAll(){
        return contacterService.findAll();
    }

    @PostMapping(value = {"", "/"})
    public ResponseMsg save(@RequestBody Contacter contacter){
        contacterService.save(contacter);
        return new ResponseMsg("success");
    }

    @DeleteMapping("/{id}")
    public ResponseMsg delete(@PathVariable String id){
        contacterService.delete(id);
        return new ResponseMsg("success");
    }


}
