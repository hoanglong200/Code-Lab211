/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DoctorController;
import controller.Validate;
/**
 *
 * @author Dell
 */
public class Main {

    public static void main(String[] args) {
        DoctorController dc = new DoctorController();
        Validate validate = new Validate();

        while (true) {
            System.out.println("======== Doctor mannagement =======");
            System.out.println("1. Add doctor");
            System.out.println("2. Update doctor");
            System.out.println("3. Delete doctor");
            System.out.println("4. Search doctor");
            System.out.println("5. Exit");
            int choice = validate.getInt("Enter Your Option: ", "Your option must be 1-5!", 1, 5);
            switch (choice) {
                case 1:
                    System.out.println("------ Add Doctor ------");
                    dc.addDoctor();
                    break;
                case 2:
                    System.out.println("------ Update Doctor ------");
                    dc.updateDoctor();
                    break;
                case 3:
                    System.out.println("------ Delete Doctor ------");
                    dc.deleteDoctor();
                    break;
                case 4:
                    System.out.println("------ Search Doctor ------");
                    dc.searchDoctor();
                    break;
                case 5:
                    return;
            }

        }
    }
}
