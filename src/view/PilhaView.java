/*
3. Desenvolva um programa que represente um Pilha de Pessoas. O programa
deve permitir (MENU):
1 - Empilhar um objeto Pessoa
2 - Desempilhar um objeto Pessoa
3 - Imprimir toda a pilha
4 - Consultar/mostrar o objeto Pessoa do topo da pilha (sem remover)
5 – Sair
Obs: Os atributos da classe Pessoa são: nome, endereço e telefone.
 */
package view;

import java.util.Scanner;
import modelo.Pessoa;
import modelo.Pilha;

/**
 * @author roger
 */
public class PilhaView {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int opcao;
        int tamanho;
        System.out.print("Informe o tamanho da pilha: ");
        tamanho = scan.nextInt();
        
        Pilha p = new Pilha(tamanho);
        Pessoa objeto;

        menu();
        opcao = scan.nextInt();

        while (opcao > 0 && opcao < 6) {
            switch (opcao) {
                case 1:
                    String nome = null;
                    String endereco = null;
                    String telefone = null;

                    scan.nextLine();

                    System.out.println("Nome: ");
                    nome = scan.nextLine();
                    System.out.println("Endereço: ");
                    endereco = scan.nextLine();
                    System.out.println("Telefone: ");
                    telefone = scan.nextLine();
                    objeto = new Pessoa(nome, endereco, telefone);
                    System.out.println(objeto);
                    p.push(objeto);
                    break;
                case 2:
                    System.out.println(p.pop());
                    break;
                case 3:
                    if (p.isEmpty()) {
                        System.out.println("Não há nada para imprimir, pilha vazia !");
                    }
                    while (!p.isEmpty()) {
                        Pessoa pessoa = p.pop();
                        System.out.println("Desempilhei: " + pessoa);
                    }
                    break;
                case 4:
                    if (p.isEmpty()) {
                        System.out.println("Não há nada para consultar, pilha vazia !");
                    }
                    System.out.println("Consultei o último da pilha: " + p.top());

                    break;
                case 5:
                    System.exit(0);
                    break;

            }

            menu();
            opcao = scan.nextInt();

        }
    }

    static void menu() {
        System.out.print(" ----- Menu -----\n"
                + "1) Inserir\n"
                + "2) Retirar\n"
                + "3) Imprimir\n"
                + "4) Consultar / Mostrar\n"
                + "5) sair\n"
                + "   Escolha uma das opções acima\n"
                + "   Opção Digitada: ");
    }

}
