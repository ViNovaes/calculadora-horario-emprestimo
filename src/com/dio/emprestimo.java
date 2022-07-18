package com.dio;

public class emprestimo {

    public static int duasParcelas() {
        return 2;
    }

    public static int tresParcelas() {
        return 3;
    }

    public static double taxaDuasParcelas() {
        return 0.3;
    }

    public static double taxaTresParcelas(){
        return 0.45;
    }

    public static void calcular(double valor, int parcelas) {

        if (parcelas == 2) {
            double valorFinal = valor +  (valor * taxaDuasParcelas());
            System.out.println("Seu valor final do emprestimo para 2 parcelas é: " + valorFinal);
        }
        else if (parcelas == 3) {
            double valorFinal = valor + (valor * taxaTresParcelas());
            System.out.println("Seu valor final do emprestimo para 3 parcelas é: " + valorFinal);
        }
        else {
            System.out.println("Quantidade de parcelas não reconhecidas");
        }
    }
}

