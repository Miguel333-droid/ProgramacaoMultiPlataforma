import classes.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 20; i++){
            Pessoa p1 = new Pessoa();


            System.out.printf("Digite o nome da " + (i + 1) + "° Pessoa: ");
            p1.setNome(scan.next());

            System.out.printf("Digite a idade da " + (i + 1) + "° Pessoa: ");
            p1.setIdade(scan.nextInt());

            System.out.printf("Digite o salario da " + (i + 1) + "° Pessoa: ");
            p1.setSalario(scan.nextDouble());

            System.out.printf(p1.ImprimirPessoa());

        }

    }

}