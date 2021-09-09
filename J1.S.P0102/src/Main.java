
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

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
    // input date
    public static Date inputDate() {
        Date date = new Date();
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        while (true) {
            try {
                date = sdf.parse(sc.nextLine());        // date nhập vào được parse theo form sdf dd/MM/yyyy
                break;
            } catch (ParseException e) {
                // nếu không đúng định dạng dd/MM/yyyy thì nhập lại
                System.out.println("You must enter date with dd/MM/yyyy!");
                System.out.print("Enter again: ");
            }
        }
        return date;
    }
    
    public static void main(String[] args) {
        // định dạng tên day of week 
        SimpleDateFormat dow = new SimpleDateFormat("EEEE");    // định dạng EEEE hiển thị ra tên của thứ trong tuần   
        System.out.print("Please enter date with format [dd/mm/yyyy]: ");
        Date date = inputDate();
        System.out.println("Your day is " + dow.format(date));
//        System.out.println("All form of date "+date);
        
    }
}
