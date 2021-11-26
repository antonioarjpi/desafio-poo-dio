package desafio.domain;

public class Course extends Contents {

    private int workload;

    @Override
    public double calculateXp() {
        return XP_PATTERN + workload;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Curso: " + getTitle()  +
                " - " + getDescription() +
                " - horas do curso = " + workload;
    }

}
