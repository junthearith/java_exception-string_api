package service;

import model.Course;

import java.util.List;

public interface CourseService {
    void addNewCourse();
    List<Course> getAllCourses();
    Course findCourseById(Integer id);
    Course findCourseByTitle(String title);
    Course removeCourseById(Integer id);
}
