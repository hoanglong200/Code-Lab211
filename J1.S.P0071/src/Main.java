/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Main {

    public static void main(String[] args) {
        TaskManagement t = new TaskManagement();
        Validate v = new Validate();

        do {
            System.out.println("1. Add task");
            System.out.println("2. Delete task");
            System.out.println("3. Show task");
            System.out.println("4. Exit");
            int choice = v.getChoice("Enter your choice: ");
            switch (choice) {
                case 1:
                    String name = v.getText("Enter name: ");
                    int typeid = v.getChoice("Input type id: ");
                    String date = v.getDate();
                    double from = v.getFrom();
                    double to = v.getTo(from);
                    String assign = v.getText("Input assignee: ");
                    String reviewer = v.getText("Input reviewer: ");
                    t.addTask(name, typeid, date, from, to, assign, reviewer);
                    break;
                case 2:
                    int id = v.getID();
                    if (!t.deleteTask(id)) {
                        System.out.println("Not found");
                    } else {
                        System.out.println("Remove success");
                    }
                    break;
                case 3:
                    System.out.println("--------------------------------------------- Task ---------------------------------------------");
                    System.out.printf("%s%11s%18s%16s%18s%21s%15s\n", "ID", "Name",
                            "Task Type", "Date", "Time", "Assignee", "Reviewer");
                    t.display();
                    break;
                case 4:
                    System.exit(0);
            }
        } while (true);
    }
}
