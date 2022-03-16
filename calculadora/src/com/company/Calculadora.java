package com.company;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Declarando os objetos
        Numero n1 = new Numero();
        Numero n2 = new Numero();
        Numero resultado = new Numero();
        Operador op = new Operador();

        //Selecionando o tipo
        int tipo;
        System.out.println("Selecione o modo: \n 1- Basico \n 2- Avançado");
        tipo = scan.nextInt();

        if(tipo == 1) {
            System.out.println("Número 1: ");
            n1.setNum(scan.nextInt());

            System.out.println("Número 2: ");
            n2.setNum(scan.nextInt());

            System.out.println("Operador: ");
            op.setOperador(scan.next().charAt(0));

            resultado.setNum(calcular(n1.getNum(), n2.getNum(), op.getOperador()));

            System.out.printf("Resultado: %d", resultado.getNum());
        } else if(tipo == 2){
            String conta;
            System.out.print("Digite sua conta: Ex(2 x 10)");
            //Gambiarra pra ler o nextLine()
            conta = scan.nextLine();
            conta = scan.nextLine();

            String[] contaSplit = new String[3];
            contaSplit = conta.split(" ");

            int num1 = Integer.parseInt(contaSplit[0]);
            int num2 = Integer.parseInt(contaSplit[2]);
            resultado.setNum(calcular(num1, num2, contaSplit[1].charAt(0)));

            System.out.printf("Resultado: %d", resultado.getNum());

        } else{
            System.out.println("Selecione um modo válido!");
        }
    }

    public static int calcular(int n1, int n2, char operador){
        switch (operador) {
            case '+':
                return n1 + n2;
            case '-':
                return n1 - n2;
            case 'x':
                return n1 * n2;
            case '/':
                return n1 / n2;
            default:
                return 0;
        }
    }

}
