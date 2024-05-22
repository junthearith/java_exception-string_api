package repository;

import model.Course;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CourseRepository {
    public static List<Course> getAllCourses() {
        List<Course> courseList = new ArrayList<>(
                List.of(new Course(1, "Web Design", "Jessica", "HTML, CSS", LocalDate.now().toString()),
                        new Course(2, "Java", "Sokpheng", "OOP", LocalDate.now().toString()))
        );
        return courseList;
    }
}
