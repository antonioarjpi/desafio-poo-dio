package desafio.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Contents> contentsSubscribed = new LinkedHashSet<>();
    private Set<Contents> contentsFinished = new LinkedHashSet<>();

    public void subscribedBootcamp(Bootcamp bootcamp){
        this.contentsSubscribed.addAll(bootcamp.getContents());
        bootcamp.getDevsSubscribed().add(this);
    }

    public void toProgress(){
        Optional<Contents> contents = this.contentsSubscribed.stream().findFirst();
        if (contents.isPresent()){
            this.contentsFinished.add(contents.get());
            this.contentsSubscribed.remove(contents.get());
        }else{
            System.err.println("Você não está matriculado em nenhum conteúdo");
        }
    }

    public double calculetTotalXp(){
       return this.contentsFinished.stream()
               .mapToDouble(value -> value.calculateXp())
               .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Contents> getContentsSubscribed() {
        return contentsSubscribed;
    }

    public void setContentsSubscribed(Set<Contents> contentsSubscribed) {
        this.contentsSubscribed = contentsSubscribed;
    }

    public Set<Contents> getContentsFinished() {
        return contentsFinished;
    }

    public void setContentsFinished(Set<Contents> contentsFinished) {
        this.contentsFinished = contentsFinished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(contentsSubscribed, dev.contentsSubscribed) && Objects.equals(contentsFinished, dev.contentsFinished);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contentsSubscribed, contentsFinished);
    }
}