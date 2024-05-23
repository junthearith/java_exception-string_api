package service;

import exception.CourseNotFoundException;
import model.Course;
import repository.CourseRepository;
import repository.CourseTableModel;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CourseServiceImp implements CourseService {
    static Random random = new Random();
    private static final int rowSize = 4;
    public static List<Course> courses = CourseRepository.allCourses();

    @Override
        public void addNewCourse() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert's course title: ");
        String title = sc.nextLine();
        System.out.print("Insert the instructor: ");
        String instructor = sc.nextLine();
        System.out.print("Insert's course requirement: ");
        String requirement = sc.nextLine();

        Course course = new Course();
        course.setId(random.nextInt(10000));
        course.setTitle(title);
        course.setInstructor(instructor);
        course.setRequirement(requirement);
        course.setStartDate(LocalDate.now().toString());

        CourseRepository.add(course);
    }

    @Override
    public void getAllCourses() {

    }
    public void listAllCourses() {
        if (courses == null) {
            System.out.println("Unable to get students data");
        }

        int currentPage = 1;
        int totalPages = (int)Math.ceil((double)courses.size() / rowSize);
        int totalRecords = courses.size();
        while (true) {
            int startIndex = (currentPage -1) * rowSize;
            int endIndex = Math.min(startIndex + rowSize, courses.size());
            List<Course> pageStudents = courses.subList(startIndex, endIndex);

            System.out.println();
            CourseTableModel.renderCourseToTable(pageStudents, rowSize, currentPage, totalPages, totalRecords);
            CourseTableModel.renderPagination();

            System.out.print("Enter the option(pagination): ");
            String pageOption = new Scanner(System.in).nextLine();
            if (pageOption.equalsIgnoreCase("p")) {
                if (currentPage > 1) {
                    currentPage--;
                } else {
                    System.out.println("You're already on the first page.");
                }
            } else if (pageOption.equalsIgnoreCase("n")){
                if (currentPage < totalPages) {
                    currentPage++;
                } else {
                    System.out.println("You're already on the last page.");
                }
            } else if (pageOption.equalsIgnoreCase("f")) {
                currentPage = 1;
            } else if (pageOption.equalsIgnoreCase("l")) {
                currentPage = totalPages;
            } else if (pageOption.equalsIgnoreCase("b")) {
                return;
            } else {
                try {
                    int pageNumber = Integer.parseInt(pageOption);
                    if (pageNumber >= 1 && pageNumber <= totalPages) {
                        currentPage = pageNumber;
                    } else {
                        System.out.println("Invalid page number. Please enter a number between 1 and " + totalPages);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input!");
                }
            }
        }
    }

    @Override
    public void findCourseById() {
        System.out.println("---------------------------------");
        System.out.println("Find course by ID");
        System.out.println("---------------------------------");
        System.out.print("Insert course id: ");
        Integer id = new Scanner(System.in).nextInt();
        List<Course> findCourse =  courses.stream()
                .filter(e->e.getId().equals(id))
                .toList();
        CourseTableModel.renderCourseToTable(findCourse, 1, 1, 1, 1);
    }

    @Override
    public void findCourseByTitle(String title) {

    }

    @Override
    public void removeCourseById(Integer id) {

    }
}
