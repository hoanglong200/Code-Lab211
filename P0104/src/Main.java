
import java.io.File;
import java.io.FileNotFoundException;
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

    public static void main(String[] args) throws FileNotFoundException {
        //input filename
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter directory of file: ");// nhập tên file gán bằng filename
        String filename = in.nextLine();
        File file = new File(filename);
        // kiểm tra file có tồn tại không
        if (file.exists()) {                                // nếu tồn tại
            Scanner sc = new Scanner(file);                 // scan file
            System.out.print("Please enter string to search: ");
            String search = in.nextLine();                  // search là giá trị cần tìm
            System.out.println();
            System.out.println("Search results:");
            while (sc.hasNext()) {                          // đọc từng dòng trong file gán bằng line
                String line = sc.nextLine();
                if (line.contains(search)) {                // nếu có từ nào chứa ký tự search thì in ra
                    System.out.println(line);
                } else {
                    System.out.println("Not found");
                    break;
                }
            }
        } else {
            // nếu không tồn tại
            System.out.println("File not found");

        }
    }
}
