package com.dio;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercicio calculadora");
        calculadora.soma(3,6);
        calculadora.subtracao(9, 2);
        calculadora.divisao(5, 2.5);
        calculadora.multiplicacao(5, 5);


        System.out.println("Exercico mensagem");
        mensagem.mensagemHora(9);
        mensagem.mensagemHora(14);
        mensagem.mensagemHora(1);

        System.out.println("Exercicio emprestimo");
        emprestimo.calcular(1000, emprestimo.duasParcelas());
        emprestimo.calcular(1000, 3);
        emprestimo.calcular(1000, 5);
    }
}