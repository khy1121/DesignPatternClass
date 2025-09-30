package week1.week1_2;

import java.util.Vector;

public class Student {
    private String name;
    private Vector courses;

    public Student   (String name) {
        this.name = name;
        courses = new Vector();
        System.out.println(name + "의 수강 과목 현황");
    }

    public void registerCourse(Course course) {
        courses.add(course);
        System.out.println(course.getCourseName()+" 과목을 추가했습니다");


    }

    public void dropCourse(Course course) {
        System.out.println(course.getCourseName()+" 과목을 삭제합니다");
        courses.remove(course);
    }


}
