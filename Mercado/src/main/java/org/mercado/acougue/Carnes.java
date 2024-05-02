package org.mercado.acougue;


import java.util.Scanner;

public class Carnes implements Acougue {

    private Long ID;
    private String marca;
    private String validade;
    private Double valor;

    //construtor
    public Carnes(Long ID, String marca, String validade, Double valor) {
        this.ID = ID;
        this.marca = marca;
        this.validade = validade;
        this.valor = valor;
    }

    public Carnes() {

    }

    //getters and setters
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }


    @Override
    public void cadastarCarne() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cadastrar nova carne em seu Açougue: ");
        System.out.println("Informe o ID: ");
        setID(scan.nextLong());

        System.out.println("Informe a marca: ");
        setMarca(scan.next());

        System.out.println("Informe a validade no formato (dd-mm-yyyy)");
        setValidade(scan.next());

        System.out.println("Informe o valor: ");
        setValor(scan.nextDouble());
    }

    @Override
    public void mostrarCarne() {
        System.out.println("Carne cadastrada com sucesso: ");
        System.out.println(getID());
        System.out.println(getMarca());
        System.out.println(getValidade());
        System.out.println(getValor());

    }
}

