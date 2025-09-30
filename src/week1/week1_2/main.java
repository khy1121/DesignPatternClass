package week1.week1_2;

public class main {

    public static void main(String[] args) {
        Student student = new Student("김헌영");
        Course course1 = new Course(1, "설계패턴");
        Course course2 = new Course(2, "고모프");
        Course course3 = new Course(3, "네프");
        Course course4 = new Course(4, "시프");
        Course course5 = new Course(5, "운영체제");


        student.registerCourse(course1);
        student.registerCourse(course2);
        student.registerCourse(course3);
        student.registerCourse(course4);
        student.registerCourse(course5);
        student.dropCourse(course1);






    }
}
