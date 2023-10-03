package TaskManager;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static short input;
    ArrayList<Task> list=new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            FileReader fileReader= new FileReader("\"C:\\Users\\Suffix_IT\\Desktop\\tasks.txt\"");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ConsoleSetup.showOptions();
        input=scanner.nextShort();
        continueConsole();
    }

    private static void continueConsole() {
        while(input!=5) {
            switch (input){
                case 1:
                    String name, details;
                    short priority;
                    System.out.println("please enter the details");
                    System.out.print("Type task name: ");
                    name=scanner.nextLine();
                    System.out.print("Enter task description: ");
                    details=scanner.nextLine();
                    System.out.print("select a priority level from 1 to 5(5 bieng the most important): ");
                    priority=scanner.nextShort();
                    System.out.println("set the duedate");
                    System.out.print("month:");
                    short day, month, year;
                    month=scanner.nextShort();
                    System.out.print("day:");
                    day=scanner.nextShort();
                    System.out.print("year:");
                    year=scanner.nextShort();
                    Date due= new Date(day,month,year);
                    Task task= new Task(name,details,due,priority);

                    nextRun();
                    continue;

                case 2:
                    System.out.println("Please select which task you want to view");
                    nextRun();
                    continue;

                case 3:
                    System.out.println("Please enter which task you want to edit");
                    nextRun();
                    continue;
                default:
                    System.out.println("Please select which task you want to delete");

            }

        }
    }

    static void nextRun(){
        ConsoleSetup.showOptions();
        input=scanner.nextShort();

    }
}