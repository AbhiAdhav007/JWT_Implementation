package com.assignment.JWT.Repositories;

import com.assignment.JWT.Model.Patient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class PatientRepository {


    HashMap<Patient , String> hm = new HashMap<>();


    public String addPatient (Patient patient){

        if(patient.getName()==null){
            throw new NullPointerException("Value Cannot be null");
        }
        if(!hm.containsValue(patient.getName())){
            hm.put(patient , patient.getName());
            return "Patient Details Added Successfully";
        }else {
            return "Patient Details Already Exists";

        }

    }

    public String updateDetails(String name , String address) throws Exception{

        for(Patient patient : hm.keySet()){

            if(patient.getName().equals(name)){
                patient.setAddress(address);
                return "Patient info is updated";
            }
        }
        throw new Exception("Invalid patient details");
    }

    public List<Patient> getPatients(){

        List<Patient> patientList = new ArrayList<>();
        for(Patient patient : hm.keySet()){

            patientList.add(patient);
        }

        return patientList;
    }
    public String removePatient(String name) throws Exception{

        Patient patientTobeRemoved = null;
        for(Patient patient : hm.keySet()){

            if(patient.getName().equals(name)){
                patientTobeRemoved = patient;
                break;
            }
        }
        if(null!=patientTobeRemoved){
            hm.remove(patientTobeRemoved);
            return "Patient is removed from database";
        }

        throw new Exception("Please enter correct info of patient");
    }

}
