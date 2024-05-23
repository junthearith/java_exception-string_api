package service;

import exception.CourseNotFoundException;

public interface CourseService {
    void addNewCourse();
    void getAllCourses();
    void findCourseById() throws CourseNotFoundException;
    void findCourseByTitle(String title);
    void removeCourseById(Integer id);
}
