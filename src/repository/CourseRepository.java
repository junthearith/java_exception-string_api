package repository;

import model.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseRepository {
    private static List<Course> courses = allCourses();
    public static List<Course> allCourses() {
        if (courses == null) {
            System.out.println("Can't get courses data!");
        }
        courses = new ArrayList<>();
        return courses;
    }
    public static void add(Course course) {
        courses.add(course);
    }
}
