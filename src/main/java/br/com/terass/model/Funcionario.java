package br.com.terass.model;

public class Funcionario {

    private int id;
    private String nome;
    private String cargo;
    private double salario;
    private boolean ativo;

//    public Funcionario(int id, String nome, String cargo, double salario, boolean ativo) {
//        this.id = id;
//        this.nome = nome;
//        this.cargo = cargo;
//        this.salario = salario;
//        this.ativo = ativo;
//    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome () {
        return nome;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getCargo() {
        return cargo;
    }
    public double getSalario () {
        return salario;
    }
    public boolean isAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getId() {
        return id;
    }
}
