package desafio.course;

import desafio.domain.Bootcamp;
import desafio.domain.Course;
import desafio.domain.Dev;
import desafio.domain.Mentoring;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("Java");
        course1.setDescription("Estruturas de dados Java");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("Java");
        course2.setDescription("Orientação a objetos");
        course2.setWorkload(8);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Mentoria java");
        mentoring.setDescription("Aprenda com os expert assuntos java");
        mentoring.setDate(LocalDate.now());

        Bootcamp bootcampMSC = new Bootcamp();
        bootcampMSC.setName("Bootcamp MSC");
        bootcampMSC.setDescription("Aprenda o melhor do Java");
        bootcampMSC.getContents().add(course1);
        bootcampMSC.getContents().add(course2);
        bootcampMSC.getContents().add(mentoring);

        Bootcamp bootcampDIO = new Bootcamp();
        bootcampDIO.setName("Bootcamp java developer");
        bootcampDIO.setDescription("Aprenda o melhor do Java");
        bootcampDIO.getContents().add(course1);
        bootcampDIO.getContents().add(course2);
        bootcampDIO.getContents().add(mentoring);

        //Primeiro Dev
        System.out.println("----------------------------------------------------");
        Dev devAntonio = new Dev();
        devAntonio.setName("Antonio");
        devAntonio.subscribedBootcamp(bootcampMSC);
        System.out.println("Olá "+ devAntonio.getName() + " você se inscreveu no "+ bootcampMSC.getName() +
                " os seus conteúdos são: \n" + devAntonio.getContentsSubscribed());
        devAntonio.toProgress();
        devAntonio.toProgress();
        System.out.println("Cursos concluídos: " + devAntonio.getContentsFinished());
        System.out.println("Sua XP: "+ devAntonio.calculetTotalXp());


        //Segundo Dev
        System.out.println("----------------------------------------------------");
        Dev devAline = new Dev();
        devAline.setName("Aline");
        devAline.subscribedBootcamp(bootcampDIO);
        System.out.println("Olá "+ devAline.getName() + " você se inscreveu no "+ bootcampDIO.getName() +
                " os seus conteúdos são: \n" + devAline.getContentsSubscribed());
        devAline.toProgress();
        System.out.println("Cursos concluídos: " + devAline.getContentsFinished());
        System.out.println("Sua XP: "+ devAline.calculetTotalXp());
        System.out.println("----------------------------------------------------");

    }
}
