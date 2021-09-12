package ru.chigurov.spring_course_udemy.aop;

public class Student {

    private String nameSurName;
    private int course;
    private double avgGrade;


    public Student(String nameSurName, int course, double avgGrade) {
        this.nameSurName = nameSurName;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getNameSurName() {
        return nameSurName;
    }

    public void setNameSurName(String nameSurName) {
        this.nameSurName = nameSurName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurName='" + nameSurName + '\'' +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
