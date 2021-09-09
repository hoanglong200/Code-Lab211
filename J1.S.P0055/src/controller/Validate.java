/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Dell
 */
public class Validate {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public int getInt(String msg, String err, int min, int max){
            int a=0;
            boolean check;
            do{
                check=true;
                try {
                    System.out.print(msg);
                    a=Integer.parseInt(in.readLine());
                    if(a<min||a>max){
                        System.out.println(err);
                        check=false;
                    }
                } catch (IOException | NumberFormatException e) {
                    System.out.println(err);
                    check=false;
                }
            }while(check==false);
            return a;
    }
    
    public String getString(String msg,String pattern){
        String value;
        do{
            try {
                System.out.print(msg);
                value = in.readLine();
                if(value.matches(pattern)){
                    break;
                }
            } catch (IOException ex) {
                ex.printStackTrace(System.out);
            }
            
        }while(true);
        return value;
    }

}
