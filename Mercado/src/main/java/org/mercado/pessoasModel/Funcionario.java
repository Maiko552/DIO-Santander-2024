package org.mercado.pessoasModel;

import java.util.Scanner;

public class Funcionario extends Pessoas{
    private String cnpj;
    private String setor;


    //construtor
    public Funcionario(String cnpj, String setor) {
        this.cnpj = cnpj;
        this.setor = setor;
    }

    //getters and setters

    public String getCnpj() {return cnpj;}

    public void setCnpj(String cnpj) {this.cnpj = cnpj;}

    public String getSetor() {return setor;}

    public void setSetor(String setor) {this.setor = setor;}

    public void cadastrarFunc(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Cadastrar novo funcionário: ");
        System.out.println("Digite o nome: ");
        setNome(scan.next());

        System.out.println("Cadastrar sexo (M/F) : ");
        setSexo(scan.next().toUpperCase());

        System.out.println("Funcionário cadastrado com sucesso!\n");
    }

    public void mostrarFunc() throws InterruptedException {
        Thread.sleep(600);
        System.out.println("Informações do funcionário cadastrado: ");
        System.out.println(getNome().toUpperCase());
        Thread.sleep(600);
        System.out.println(getCnpj());
        Thread.sleep(600);
        System.out.println(getSexo().charAt(0));
        Thread.sleep(600);
        System.out.println(getSetor());
    }

}
