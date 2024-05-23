import service.CourseService;
import service.CourseServiceImp;
import view.View;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        display();
    }
    public static void display() {
        CourseServiceImp serviceImp = new CourseServiceImp();
        Scanner sc = new Scanner(System.in);
        System.out.println();
        View.menu();
        String option = "";
        while (!option.equals("0")) {
            System.out.print("Insert option: ");
            option = sc.nextLine();
            switch (option) {
                case "1":
                    serviceImp.addNewCourse();
                    break;
                case "2":
                    serviceImp.listAllCourses();
                    break;
                case "3":
                    System.out.println("3. search by name");
                    break;
                case "4":
                    System.out.println("4. delete by id");
                    break;
                case "99":
                    System.out.println("99. Exit");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
