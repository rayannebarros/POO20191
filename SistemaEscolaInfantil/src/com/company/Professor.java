package com.company;

/* ¨Para os professores, devem constar as informações sobre seu grau de instrução, matrícula, nome, salário base.*/

public class Professor {
    private String nome;
    private int matricula;
    private float salario;
    private String grau;


    Professor(String nome, int matricula, float salario, String grau) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        this.grau = grau;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }
}