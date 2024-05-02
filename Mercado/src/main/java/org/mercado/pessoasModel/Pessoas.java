package org.mercado.pessoasModel;


public class Pessoas {
    private Long id ;
    private String cpf;
    private String nome;
    private String sexo;
    private String celular;

    //métodos getters and setters
    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getCpf() {return cpf;}

    public void setCpf(String cpf) {this.cpf = cpf;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getSexo() {return sexo;}

    public void setSexo(String sexo) {this.sexo = sexo;}

    public String getCelular() {return celular;}

    public void setCelular(String celular) {this.celular = celular;}


}
