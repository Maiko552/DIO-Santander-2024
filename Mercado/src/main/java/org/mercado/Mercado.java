package org.mercado;

import org.mercado.acougue.Acougue;
import org.mercado.acougue.Carnes;
import org.mercado.itensMercado.Itens;
import org.mercado.itensMercado.ItensMercado;
import org.mercado.padaria.Padaria;
import org.mercado.padaria.Paes;

import java.util.Scanner;

public class Mercado implements Acougue, Padaria, ItensMercado {
    //açougue
    Carnes ca = new Carnes();
    Scanner scan = new Scanner(System.in);
    @Override
    public void cadastarCarne() {


        System.out.println("Cadastrar nova carne em seu Açougue: ");
        System.out.println("Informe o ID:");
        ca.setID(scan.nextLong());

        System.out.println("Informe a marca: ");
        ca.setMarca(scan.next());

        System.out.println("Informe a validade no formato (dd-mm-yyyy)");
        ca.setValidade(scan.next());

        System.out.println("Informe o valor: ");
        ca.setValor(scan.nextDouble());
    }

    @Override
    public void mostrarCarne() {
        System.out.println("Carne cadastrada com sucesso: ");
        System.out.println(ca.getID());
        System.out.println(ca.getMarca());
        System.out.println(ca.getValidade());
        System.out.println(ca.getValor());

    }

    Itens item = new Itens(1L);
    @Override
    public void cadastrarItem(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Cadastrar novo produto na loja: ");

        System.out.println("Informe a descrição: ");
        item.setDescricaoItem(scan.next());

        System.out.println("Informe o valor: ");
        item.setValor(scan.nextFloat());
    }
    @Override
    public void mostrarItem(){
        System.out.println("\nSeu produto cadastrado: ");
        System.out.println(item.getDescricaoItem());
        System.out.println(item.getValor());
    }

    Paes p = new Paes(1L);
    @Override
    public void cadastrarPao() {

        System.out.println("Cadastrar novo produto na Padaria: ");

        System.out.println("Informe a descrição: ");
        p.setTipoAlimento(scan.next());

        System.out.println("Informe o valor: ");
        p.setValor((scan.nextFloat()));

        System.out.println("Informe a validade (dd/mm/yyyy): ");
        p.setValidade(scan.next());
        System.out.println("Produto cadastrado com sucesso!\n ");
    }
    public void mostrarPao() throws InterruptedException {
        Thread.sleep(900);
        System.out.println("Seu produto cadastrado: ");
        System.out.println(p.getTipoAlimento());
        System.out.println(p.getValor());
        System.out.println(p.getValidade());

    }
}
