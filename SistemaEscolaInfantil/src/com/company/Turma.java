package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Turma {
    private Professor professor;
    private List<Aluno> alunos = new ArrayList();
    private int sala;
    private String horario;
    private int codigo;

    public void visualTurma(){
        System.out.printf("Professor: %s\n", professor.getNome());
        System.out.printf("Codigo: %s\n",codigo);
        System.out.printf("Sala: %d\n",sala);
        System.out.printf("Sala: %s\n",horario);

        for (int i = 0; i < getAlunos().size(); i++){
            System.out.printf("Alunos: %s\n",alunos.get(i).getNome());

        }
    }
    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
