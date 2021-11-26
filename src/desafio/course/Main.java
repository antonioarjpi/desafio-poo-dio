package desafio.course;

import desafio.domain.Course;
import desafio.domain.Mentoring;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("Java");
        course1.setDescription("Python para iniciantes");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("Python");
        course2.setDescription("Python para iniciantes");
        course2.setWorkload(8);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Mentoria java");
        mentoring.setDescription("Aprenda com os expert assuntos java");
        mentoring.setDate(LocalDate.now());

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentoring);

    }
}
