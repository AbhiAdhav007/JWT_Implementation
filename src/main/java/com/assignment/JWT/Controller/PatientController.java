package com.assignment.JWT.Controller;

import com.assignment.JWT.Model.Patient;
import com.assignment.JWT.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Patient")

public class PatientController {

    @Autowired
    PatientService patientService;


    @PostMapping("/add")
    public ResponseEntity<String> addPatient (@RequestBody Patient patient){

        String msg = patientService.addPatient(patient);
        return new ResponseEntity<>(msg, HttpStatus.CREATED);
    }

    @PutMapping("/updateAddress")
    public ResponseEntity<String> updateDetails(@RequestParam String name ,@RequestParam String address) throws Exception{

        return new ResponseEntity<>(patientService.updateDetails(name,address) , HttpStatus.OK);
    }


    @GetMapping("/getPatients")
    public ResponseEntity<List<Patient>> getPatients(){

        return new ResponseEntity<>(patientService.getPatients() , HttpStatus.FOUND);
    }
    @DeleteMapping("/remove")
    public ResponseEntity<String> removePatient(@RequestParam String name) throws Exception{

        return new ResponseEntity<>(patientService.removePatient(name) , HttpStatus.OK);
    }
}
