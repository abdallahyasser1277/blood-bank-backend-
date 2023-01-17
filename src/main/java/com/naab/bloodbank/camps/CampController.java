package com.naab.bloodbank.camps;

import com.naab.bloodbank.ResponseMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/camps")
@CrossOrigin(origins = "http://localhost:4200/")
public class CampController {
    @Autowired
    private CampService campService;

    @GetMapping(value = {"", "/"})
    public List<Camp> getAll(){
        return campService.findAll();
    }

    @PostMapping(value = {"", "/"})
    public ResponseMsg save(@RequestBody Camp camp){
        campService.save(camp);
        return new ResponseMsg("success");}

    @DeleteMapping("/{id}")
    public ResponseMsg delete(@PathVariable String id){
        campService.delete(id);
        return new ResponseMsg("success");
    }
}
