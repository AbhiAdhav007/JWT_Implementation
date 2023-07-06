package com.assignment.JWT.Service;

import com.assignment.JWT.Model.Patient;
import com.assignment.JWT.Repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {


    @Autowired
    PatientRepository patientRepository;

    public String addPatient (Patient patient){

        return patientRepository.addPatient(patient);
    }

    public String updateDetails(String name , String address) throws  Exception{

        return patientRepository.updateDetails(name, address);
    }

    public List<Patient> getPatients(){

        return patientRepository.getPatients();
    }
    public String removePatient(String name) throws Exception{

        return patientRepository.removePatient(name);
    }
}
