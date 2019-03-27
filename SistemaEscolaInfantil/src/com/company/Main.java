package com.company;
import java.util.ArrayList;
import java.util.List;
public class Main{

    public static void main(String[] args) {
        Turma matematica = new Turma();
        matematica.setCodigo(107);
        matematica.setProfessor(new Professor("João", 20190007, 3450, "Mestrado"));
        matematica.setSala(29);
        matematica.setHorario("A");

        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        Boletim boletim1 = new Boletim();
        boletim1.setNotas(new float[]{9, 0, 8, 5});
        Boletim boletim2 = new Boletim();
        boletim2.setNotas(new float[]{4, 2, 1, 6});


        alunos.add(new Aluno("João", 20190001, "08 de Abril", "Joana", boletim1));
        alunos.add(new Aluno("Maria", 20190002, "6 de Janeiro","Tarcila", boletim2));

        matematica.setAlunos(alunos);

        matematica.visualTurma();
    }
}
