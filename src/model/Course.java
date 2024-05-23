package model;

public class Course {
    private Integer id;
    private String title;
    private String instructor;
    private String requirement;
    private String startDate;

    public Course() {
    }

    public Course(Integer id, String title, String instructor, String requirement, String startDate) {
        this.id = id;
        this.title = title;
        this.instructor = instructor;
        this.requirement = requirement;
        this.startDate = startDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", instructor='" + instructor + '\'' +
                ", requirement='" + requirement + '\'' +
                ", startDate='" + startDate + '\'' +
                '}';
    }
}
