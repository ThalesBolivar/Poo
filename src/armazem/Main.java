package armazem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque e1 = new Estoque (1, "Arroz", 10,25); // crio o tipo estoque e determino que ele é 1
        Estoque e2 = new Estoque (2, "Feijão", 10,5.65);
        Estoque e3 = new Estoque (3,"Açucar", 10,16);

        e1.Acrescimo(100);
        System.out.println(e1.ConsultaEstoque());

        e2.Baixa(7);
        System.out.println(e2.ConsultaEstoque());

        System.out.println(e3.ConsultaEstoque());
        //System.out.println(e3.TotalEstoque());

        // Chamando para o usuario digitar em algum momento
        Scanner ler = new Scanner (System.in);

        int id, estoque;
        String produto ;
        double preco;

        System.out.println("Id:");
        id=ler.nextInt();

        System.out.println("Nome do produto:");
        produto=ler.nextLine();
        produto=ler.nextLine();

        System.out.println("Estoque inicial:");
        estoque=ler.nextInt();

        System.out.println("Preco:");
        preco=ler.nextDouble();

        Estoque e4 = new Estoque (id, produto,estoque, preco);

        System.out.printf("Digite a quantidade para acrescentar.");
        int qtde = ler.nextInt();

        System.out.printf("Digite a quantidade para baixar.");
        qtde=ler.nextInt();
        e1.Baixa(qtde);

        System.out.println(e4.ConsultaEstoque ());

    }
}