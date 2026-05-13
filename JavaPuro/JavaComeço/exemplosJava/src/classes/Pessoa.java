package classes;

public class Pessoa {
    private String nome;
    private int idade;
    private double salario;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String ImprimirPessoa(){
        String dados = "Seu nome é: " + getNome() + "\n";

         if(getIdade() >= 18){
             dados = dados + ".Sua idade é: " + getIdade() + "\n";
         }
        dados = dados + ".Seu salário é: " + getSalario() + "\n";
        return dados;

    }
}