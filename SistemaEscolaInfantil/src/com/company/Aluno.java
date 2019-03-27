package com.company;
/* devem existir informações sobre seu nome,  matrícula, data de nascimento, nome da mãe;*/

public class Aluno {
    private String nome;
    private int matricula;
    private String datanascimento;
    private String nomemae;
    private Boletim boletim;


Aluno (String nome, int matricula, String datanascimento, String nomemae, Boletim boletim) {
    this.nome = nome;
    this.matricula = matricula;
    this.datanascimento = datanascimento;
    this.nomemae = nomemae;
    this.boletim = boletim;
}

public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome = nome;
}

public int getMatricula(){
    return matricula;
}

public void setMatricula(int matricula){
    this.matricula = matricula;
}

public String getDatanascimento(){
    return datanascimento;
}

public void setdataNascimento(String datanascimento){
    this.datanascimento = datanascimento;
}

public String getNomemae(){
    return nomemae;
}
public void setNomemae(String nomemae){
    this.nomemae = nomemae;
}

public Boletim getBoletim(){
    return boletim;
}

public void setBoletim(Boletim boletim){
    this.boletim = boletim;
}
}
