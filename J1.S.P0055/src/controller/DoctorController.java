/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Doctor;

/**
 *
 * @author Dell
 */
public class DoctorController {

    List<Doctor> listDoctor = new ArrayList<>();
    Validate validate = new Validate();

    public int indexCode(String code) {
        for (int i = 0; i < listDoctor.size(); i++) {
            if (listDoctor.get(i).getCode().equals(code)) {
                return i;
            }
        }
        return -1;
    }

    public void addDoctor() {
        String code;
        do {
            code = validate.getString("Enter Code: ", "[a-zA-Z 0-9]+");
            if (indexCode(code) != -1) {
                System.out.println("Code is exist.");
            }
        } while (indexCode(code) != -1);

        String name = validate.getString("Enter Name: ", "[a-zA-Z ]+");
        String specialization = validate.getString("Enter Specialization: ", "[a-zA-Z ]+");
        int availability = validate.getInt("Enter Availability: ", "Availability is a positive integer", 1, Integer.MAX_VALUE);
        Doctor doctor = new Doctor(code, name, specialization, availability);
        listDoctor.add(doctor);
        System.out.println("Add successful.");
    }

    //allow user update doctor
    public void updateDoctor() {
        //check code exist or not
        String code = validate.getString("Enter Code: ", "[a-zA-Z 0-9]+");
        int indexCode = indexCode(code);
        if (indexCode == -1) {
            System.out.println("Doctor code does not exist");
        } else {
            String name = validate.getString("Enter Name: ", "[a-zA-Z ]*");
            if (!name.trim().equals("")) {
                listDoctor.get(indexCode).setName(name);
            }
            String specialization = validate.getString("Enter Specialization: ", "[a-zA-Z ]*");
            if (!specialization.trim().equals("")) {
                listDoctor.get(indexCode).setSpecialization(specialization);
            }

            String availability = validate.getString("Enter Availability", "[0-9]*");
            if (!availability.trim().equals("")) {
                listDoctor.get(indexCode).setAvailability(Integer.parseInt(availability));
            }
        }
        System.err.println("Update successful");
    }

    //delete doctor
    public void deleteDoctor() {
        String code = validate.getString("Enter Code: ", "[a-zA-Z 0-9]+");
        int indexCode = indexCode(code);
        if (indexCode == -1) {
            System.out.println("Doctor code does not exist");
        } else {
            //Xoa
            listDoctor.remove(indexCode);
        }
        System.err.println("Delete successful.");
    }

    //allow user search doctor
    public void searchDoctor() {
        String nameSearch = validate.getString("Enter name", "[a-zA-Z ]*");
        ArrayList<Doctor> listFoundByName = listFoundByName(listDoctor, nameSearch);
        if (listFoundByName.isEmpty()) {
            System.err.println("List empty.");
        } else {
            System.out.println("------- Result -------");
            System.out.printf("%-10s%-15s%-25s%-20s\n", "Code", "Name",
                    "Specialization", "Availability");
            for (Doctor doctor : listFoundByName) {
                System.out.printf("%-10s%-15s%-25s%-20d\n", doctor.getCode(),
                        doctor.getName(), doctor.getSpecialization(),
                        doctor.getAvailability());
            }
        }
    }

    public static Doctor getDoctorByCode(List<Doctor> ld, String code) {
        for (Doctor doctor : ld) {
            if (doctor.getCode().equalsIgnoreCase(code)) {
                return doctor;
            }
        }
        return null;
    }

    public static ArrayList<Doctor> listFoundByName(List<Doctor> ld, String name) {
        ArrayList<Doctor> listFoundByName = new ArrayList<>();
        for (Doctor doctor : ld) {
            if (doctor.getName().contains(name)) {
                listFoundByName.add(doctor);
            }
        }
        return listFoundByName;
    }
}
