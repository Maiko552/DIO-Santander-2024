package org.mercado.padaria;

import java.util.Date;
import java.util.Scanner;

public class Paes implements Padaria{

    private Long id;
    private String tipoAlimento;
    private Float valor;
    private String validade;

    public Paes(Long id) {
        this.id = id;
        this.tipoAlimento = tipoAlimento;
        this.valor = valor;
        this.validade = validade;
    }

    //métodos
    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getTipoAlimento() {return tipoAlimento;}

    public void setTipoAlimento(String tipoAlimento) {this.tipoAlimento = tipoAlimento;}

    public Float getValor() {return valor;}

    public void setValor(Float valor) {this.valor = valor;}

    public String getValidade() {return validade;}

    public void setValidade(String validade) {this.validade = validade;}

    public void cadastrarPao(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Cadastrar novo produto na Padaria: ");

        System.out.println("Informe o tipo de alimento: ");
        setTipoAlimento(scan.next());

        System.out.println("Informe o valor: ");
        setValor(scan.nextFloat());

        System.out.println("Informe a validade (dd/mm/yyyy): ");
        setValidade(scan.next());
    }

     public void mostrarPao() throws InterruptedException {
        Thread.sleep(900);
        System.out.println("Seu produto cadastrado: ");
        System.out.println(getTipoAlimento());
        System.out.println(getValor());
        System.out.println(getValidade());
    }
}

