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

package modelo;
/**
 *
 * @author roger
 */
public class Pessoa {
    
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + '}';
    }
}
