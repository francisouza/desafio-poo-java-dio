package br.com.dio.desafio;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Curso extends Conteudo {
    private int cargaHoraria;
    Set<Conteudo> conteudoCurso = new LinkedHashSet<>();
    Set<Dev> devsInscritos = new HashSet<>();

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso(){

    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Set<Conteudo> getConteudos() {
        return conteudoCurso;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }


}

