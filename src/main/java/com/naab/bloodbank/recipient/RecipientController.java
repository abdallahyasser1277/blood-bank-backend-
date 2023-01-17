package com.naab.bloodbank.recipient;

import com.naab.bloodbank.ResponseMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/recipient")
@CrossOrigin(origins = "http://localhost:4200/")
public class RecipientController {
    @Autowired
    private RecipientService recipientService;

    @GetMapping(value = {"", "/"})
    public List<Recipient> getAll(){
        return recipientService.findAll();
    }

    @PostMapping(value = {"", "/"})
    public ResponseMsg save(@RequestBody Recipient recipient){
        recipientService.save(recipient);
        return new ResponseMsg("success");
    }

    @DeleteMapping("/{id}")
    public ResponseMsg delete(@PathVariable String id){
        recipientService.delete(id);
        return new ResponseMsg("success");
    }


}
