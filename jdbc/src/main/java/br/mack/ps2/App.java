package br.mack.ps2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Conne bd = new Conne();
        Scanner ent = new Scanner(System.in);

        boolean sair = false;

        while (sair != true) {
            System.out.println("Escolha sua opção: \n 1- adicionar \n 2- Remover \n 3- sair");
            int op = ent.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Digite o numero da conta:");
                    int num = ent.nextInt();
                    System.out.println("Digite o Saldo da conta");
                    String saldo = ent.next();
                    bd.add(num, saldo);
                    break;
                case 2:
                    System.out.println("Digite o numero da conta:");
                    int num1 = ent.nextInt();
                    bd.remove(num1);
                    break;
                case 3:
                    sair = true;
                    break;
            
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
            
        }
        
        
    }
}
