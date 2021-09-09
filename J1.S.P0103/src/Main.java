
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dell
 */
public class Main {
    // nhập date
    public static Date inputDate() {
        Date date = new Date();
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        while (true) {
            try {
                date = sdf.parse(sc.nextLine());
                break;
            } catch (ParseException e) {
                System.out.println("You must enter date with dd/MM/yyyy!");
                System.out.print("Enter again: ");
            }
        }
        return date;
    }

    public static void main(String[] args) {
        System.out.print("Please enter the first date: ");
        Date date1 = inputDate();
        System.out.print("Please enter the second date: ");
        Date date2 = inputDate();
        if (date1.before(date2)) {
            System.out.println("Date1 is before Date2");
        } else if (date1.after(date2)) {
            System.out.println("Date1 is after Date2");
        } else {
            System.out.println("Duplicate!");
        }
    }
}
