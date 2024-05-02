package org.mercado.itensMercado;

import java.util.Scanner;

public class Itens implements ItensMercado {

    private Long ID;
    private String descricaoItem;
    private Float valor;


    public Itens(Long ID, String descricaoItem, Float valor) {
        this.ID = ID;
        this.descricaoItem = descricaoItem;
        this.valor = valor;
    }

    public Itens(Long ID) {

    }

    public Long getID() {return ID;}

    public void setID(Long ID) {this.ID = ID;}

    public String getDescricaoItem() {return descricaoItem;}

    public void setDescricaoItem(String descricaoItem) {this.descricaoItem = descricaoItem;}

    public Float getValor() {return valor;}

    public void setValor(Float valor) {this.valor = valor;}

    public void cadastrarItem(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Cadastrar novo produto na loja: ");

        System.out.println("Informe a descrição: ");
        setDescricaoItem(scan.next());

        System.out.println("Informe o valor: ");
        setValor(scan.nextFloat());
    }

    public void mostrarItem(){
        System.out.println("Seu produto cadastrado: ");
        System.out.println(getID());
        System.out.println(getDescricaoItem());
        System.out.println(getValor());
    }
}
