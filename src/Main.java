import exception.CourseNotFoundException;
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
        while (!option.equals("exit")) {
            System.out.print("Insert option: ");
            option = sc.nextLine();
            switch (option) {
                case "1":
                    serviceImp.addNewCourse();
                    break;
                case "2":
                    serviceImp.getAllCourses();
                    break;
                case "3":
                    serviceImp.findCourseById();
                    break;
                case "4":
                    serviceImp.findCourseByTitle();
                    break;
                case "5":
                    serviceImp.removeCourseById();
                    break;
                case "0":
                    System.out.println("0. Exit");
                    System.exit(1);
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
