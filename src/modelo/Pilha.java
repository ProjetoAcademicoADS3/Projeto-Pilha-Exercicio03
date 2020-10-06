/*
3. Desenvolva um programa que represente um Pilha de Pessoas. O programa
deve permitir (MENU):
1 - Empilhar um objeto Pessoa
2 - Desempilhar um objeto Pessoa
3 - Imprimir toda a pilha
4 - Consultar/mostrar o objeto Pessoa do topo da pilha (sem remover)
5 – Sair
Obs: Os atributos da classe Pessoa são: nome, endereço e telefone.
Link conceito teórico > https://www.youtube.com/watch?v=2V91Re1czwA
Link conceito prático > https://www.youtube.com/watch?v=GmGLuabRzVw
*/

package modelo;

/**
 * @author roger
 */
public class Pilha {

    int tamanho;
    Pessoa pessoa[];
    int topo;

    // construtor para criar objeto pilha e pessoa
    // e também determinando o início da pilha com topo = -1; ou seja vazia
    public Pilha(int tamanho) { 
        this.tamanho = tamanho;
        pessoa = new Pessoa[tamanho];
        topo = - 1; //posição inválida inicial do vetor
    }

    //Método inserir elementos/objetos na pilha
    public void push(Pessoa objeto) {
        if (isFull()) {
            throw new RuntimeException("A pilha está cheia");
        }
        topo++;
        pessoa[topo] = objeto;
    }

    //Método retirar elementos/objeto da pilha(neste caso de pessoa)
    public Pessoa pop() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha está vazia");
        }
        Pessoa objeto;
        objeto = pessoa[topo];
        topo--;
        return objeto;
    }

    //Método boolean que verifica se a pilha está vazia
    public boolean isEmpty() {
        return topo == -1;
    }

    //Método boolean que verifica se a pilha está cheia
    public boolean isFull() {
        return topo == pessoa.length - 1;
    }

    //Método que retorna/consulta o elemento/objeto que está na posição topo
    public Pessoa top() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha está vazia");
        }
        return pessoa[topo]; 
    }
}
