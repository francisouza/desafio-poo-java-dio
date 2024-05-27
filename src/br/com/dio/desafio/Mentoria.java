package br.com.dio.desafio;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Mentoria extends Conteudo {

    private LocalDate data;
    Set<Conteudo> conteudoCurso = new LinkedHashSet<>();
    Set<Dev> devsInscritos = new HashSet<>();

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Set<Conteudo> getConteudos() {
        return conteudoCurso;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
